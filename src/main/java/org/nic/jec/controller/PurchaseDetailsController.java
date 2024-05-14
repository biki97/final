package org.nic.jec.controller;

import org.nic.jec.entity.PurchaseDetails;
import org.nic.jec.services.PurchaseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/purchase-details")
public class PurchaseDetailsController {
    private final PurchaseDetailsService purchaseDetailsService;

    @Autowired
    public PurchaseDetailsController(PurchaseDetailsService purchaseDetailsService) {
        this.purchaseDetailsService = purchaseDetailsService;
    }

    @PostMapping("/submit")
    public String submitPurchaseDetails(
            @RequestParam("stock_on_transition") int stockOnTransition,
            @RequestParam("itc_carried_forward") int itcCarriedForward,
            @RequestParam("itc_capital_goods") int itcCapitalGoods,
            @RequestParam("itc_debit_note") int itcDebitNote,
            @RequestParam("oth_adjustment_add") int othAdjustmentAdd,
            @RequestParam("total_itc") int totalItc,
            @RequestParam("itc_credit_note") int itcCreditNote,
            @RequestParam("tax_credit_reversed") int taxCreditReversed,
            @RequestParam("oth_adjustment_sub") int othAdjustmentSub,
            @RequestParam("tot_itc_deduct") int totItcDeduct,
            @RequestParam("tot_net_itc") int totNetItc,
            @RequestParam("tax_payable") int taxPayable,
            @RequestParam("interest_penalty_dues") int interestPenaltyDues,
            @RequestParam("total_dues") int totalDues,
            @RequestParam("tax_deducted_at_source") int taxDeductedAtSource,
            @RequestParam("balance_excess") int balanceExcess,
            @RequestParam("tax_paid") int taxPaid,
            @RequestParam("balance_due") int balanceDue,
            @RequestParam("cst_adjust_liability") int cstAdjustLiability,
            @RequestParam("refund") int refund,
            @RequestParam("balance_carried_forward") int balanceCarriedForward,
            @RequestParam("advance_total") int totalNoOfReturnsSubmittedByDealer,
            Model model) {


        // Create object with the received parameters
        PurchaseDetails purchaseDetails = new PurchaseDetails();
        purchaseDetails.setStockOnTransition(stockOnTransition);
        purchaseDetails.setItcCarriedForward(itcCarriedForward);
        purchaseDetails.setItcCapitalGoods(itcCapitalGoods);
        purchaseDetails.setItcDebitNote(itcDebitNote);
        purchaseDetails.setOthAdjustmentAdd(othAdjustmentAdd);
        purchaseDetails.setTotalItc(totalItc);
        purchaseDetails.setItcCreditNote(itcCreditNote);
        purchaseDetails.setTaxCreditReversed(taxCreditReversed);
        purchaseDetails.setOthAdjustmentSub(othAdjustmentSub);
        purchaseDetails.setTotItcDeduct(totItcDeduct);
        purchaseDetails.setTotNetItc(totNetItc);
        purchaseDetails.setTaxPayable(taxPayable);
        purchaseDetails.setInterestPenaltyDues(interestPenaltyDues);
        purchaseDetails.setTotalDues(totalDues);
        purchaseDetails.setTaxDeductedAtSource(taxDeductedAtSource);
        purchaseDetails.setBalanceExcess(balanceExcess);
        purchaseDetails.setTaxPaid(taxPaid);
        purchaseDetails.setBalanceDue(balanceDue);
        purchaseDetails.setCstAdjustLiability(cstAdjustLiability);
        purchaseDetails.setRefund(refund);
        purchaseDetails.setBalanceCarriedForward(balanceCarriedForward);
        purchaseDetails.setTotalNoOfReturnsSubmittedByDealer(totalNoOfReturnsSubmittedByDealer);

        // Save using your service
        purchaseDetailsService.savePurchaseDetails(purchaseDetails);

//        // Save purchase details and add success message to model
//        model.addAttribute("successMessage", "Form submitted successfully!");


        // Redirect to a success page
        return "redirect:/purchase-details/success";
    }
    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        // Display success message if available
        if (model.containsAttribute("successMessage")) {
            model.addAttribute("successMessage", model.getAttribute("successMessage"));
        }
        return "redirect:/login";
    }
}

