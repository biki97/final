//package org.nic.jec.controller;
//
//import org.nic.jec.entity.PurchaseDetails;
//import org.nic.jec.entity.PurchaseQuarterDetails;
//import org.nic.jec.entity.SalesEntity;
//import org.nic.jec.entity.TotalOutputTaxOnline;
//import org.nic.jec.services.PurchaseDetailsService;
//import org.nic.jec.services.PurchaseQuarterDetailsService;
//import org.nic.jec.services.SalesService;
//import org.nic.jec.services.TotalOutputTaxOnlineService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.math.BigDecimal;
//
//@Controller
//@RequestMapping("/data")
//public class DataController {
//
//    private final PurchaseDetailsService purchaseDetailsService;
//    private final PurchaseQuarterDetailsService purchaseQuarterDetailsService;
//    private final SalesService salesService;
//    private final TotalOutputTaxOnlineService totalOutputTaxOnlineService;
//
//    @Autowired
//    public DataController(PurchaseDetailsService purchaseDetailsService, PurchaseQuarterDetailsService purchaseQuarterDetailsService, SalesService salesService, TotalOutputTaxOnlineService totalOutputTaxOnlineService) {
//        this.purchaseDetailsService = purchaseDetailsService;
//        this.purchaseQuarterDetailsService = purchaseQuarterDetailsService;
//        this.salesService = salesService;
//        this.totalOutputTaxOnlineService = totalOutputTaxOnlineService;
//    }
//
//    @PostMapping("/purchase-details")
//    public String submitPurchaseDetailsWithParams(
//            @RequestParam("stock_on_transition") int stockOnTransition,
//            @RequestParam("itc_carried_forward") int itcCarriedForward,
//            @RequestParam("itc_capital_goods") int itcCapitalGoods,
//            @RequestParam("itc_debit_note") int itcDebitNote,
//            @RequestParam("oth_adjustment_add") int othAdjustmentAdd,
//            @RequestParam("total_itc") int totalItc,
//            @RequestParam("itc_credit_note") int itcCreditNote,
//            @RequestParam("tax_credit_reversed") int taxCreditReversed,
//            @RequestParam("oth_adjustment_sub") int othAdjustmentSub,
//            @RequestParam("tot_itc_deduct") int totItcDeduct,
//            @RequestParam("tot_net_itc") int totNetItc,
//            @RequestParam("tax_payable") int taxPayable,
//            @RequestParam("interest_penalty_dues") int interestPenaltyDues,
//            @RequestParam("total_dues") int totalDues,
//            @RequestParam("tax_deducted_at_source") int taxDeductedAtSource,
//            @RequestParam("balance_excess") int balanceExcess,
//            @RequestParam("tax_paid") int taxPaid,
//            @RequestParam("balance_due") int balanceDue,
//            @RequestParam("cst_adjust_liability") int cstAdjustLiability,
//            @RequestParam("refund") int refund,
//            @RequestParam("balance_carried_forward") int balanceCarriedForward,
//            @RequestParam("total_no_of_returns_submitted_by_dealer") int totalNoOfReturnsSubmittedByDealer,
//            Model model) {
//
//        // Create object with the received parameters
//        PurchaseDetails purchaseDetails = new PurchaseDetails();
//        purchaseDetails.setStockOnTransition(stockOnTransition);
//        purchaseDetails.setItcCarriedForward(itcCarriedForward);
//        purchaseDetails.setItcCapitalGoods(itcCapitalGoods);
//        purchaseDetails.setItcDebitNote(itcDebitNote);
//        purchaseDetails.setOthAdjustmentAdd(othAdjustmentAdd);
//        purchaseDetails.setTotalItc(totalItc);
//        purchaseDetails.setItcCreditNote(itcCreditNote);
//        purchaseDetails.setTaxCreditReversed(taxCreditReversed);
//        purchaseDetails.setOthAdjustmentSub(othAdjustmentSub);
//        purchaseDetails.setTotItcDeduct(totItcDeduct);
//        purchaseDetails.setTotNetItc(totNetItc);
//        purchaseDetails.setTaxPayable(taxPayable);
//        purchaseDetails.setInterestPenaltyDues(interestPenaltyDues);
//        purchaseDetails.setTotalDues(totalDues);
//        purchaseDetails.setTaxDeductedAtSource(taxDeductedAtSource);
//        purchaseDetails.setBalanceExcess(balanceExcess);
//        purchaseDetails.setTaxPaid(taxPaid);
//        purchaseDetails.setBalanceDue(balanceDue);
//        purchaseDetails.setCstAdjustLiability(cstAdjustLiability);
//        purchaseDetails.setRefund(refund);
//        purchaseDetails.setBalanceCarriedForward(balanceCarriedForward);
//        purchaseDetails.setTotalNoOfReturnsSubmittedByDealer(totalNoOfReturnsSubmittedByDealer);
//
//        // Save using your service
//        purchaseDetailsService.savePurchaseDetails(purchaseDetails);
//
//        // Redirect to a success page
//        return "redirect:/purchase-details/success";
//    }
//
//
//    @PostMapping("/purchase-quarter-details")
//    public String submitPurchaseQuarterDetailsWithParams(
//            @RequestParam("p_exempt_rate_a") BigDecimal pExemptRateA,
//            @RequestParam("p_exempt_rate_b") Double pExemptRateB,
//            @RequestParam("p_4_rate_a") Double p4RateA,
//            @RequestParam("p_4_rate_b") Double p4RateB,
//            @RequestParam("p_12_5_rate_a") Double p125RateA,
//            @RequestParam("p_12_5_rate_b") Double p125RateB,
//            @RequestParam("p_1_rate_a") Double p1RateA,
//            @RequestParam("p_1_rate_b") Double p1RateB,
//            @RequestParam("rate_p_8_a") Double rate8A,
//            @RequestParam("rate_p_8_b") Double rate8B,
//            @RequestParam("rate_p_9_a") Double rate9A,
//            @RequestParam("rate_p_9_b") Double rate9B,
//            @RequestParam("tot_amt_imp_tax") Double totalAmountOfInputTax,
//            Model model) {
//
//        PurchaseQuarterDetails purchaseQuarterDetails = new PurchaseQuarterDetails();
//        purchaseQuarterDetails.setExemptRateA(pExemptRateA);
//        purchaseQuarterDetails.setExemptRateB(pExemptRateB);
//        purchaseQuarterDetails.setRate4A(p4RateA);
//        purchaseQuarterDetails.setRate4B(p4RateB);
//        purchaseQuarterDetails.setRate125A(p125RateA);
//        purchaseQuarterDetails.setRate125B(p125RateB);
//        purchaseQuarterDetails.setRate1A(p1RateA);
//        purchaseQuarterDetails.setRate1B(p1RateB);
//        purchaseQuarterDetails.setRate8A(rate8A);
//        purchaseQuarterDetails.setRate8B(rate8B);
//        purchaseQuarterDetails.setRate9A(rate9A);
//        purchaseQuarterDetails.setRate9B(rate9B);
//        purchaseQuarterDetails.setTotalAmountOfInputTax(totalAmountOfInputTax);
//
//        purchaseQuarterDetailsService.savePurchaseQuarterDetails(purchaseQuarterDetails);
//
//        return "redirect:/data/success"; // Redirect to a success page
//    }
//
//
//    @PostMapping("/sales")
//    public String submitSalesDetailsWithParams(
//            @RequestParam("s_exempt_rate_a") BigDecimal sExemptRateA,
//            @RequestParam("s_exempt_rate_b") BigDecimal sExemptRateB,
//            @RequestParam("s_0_rate_a") BigDecimal s0RateA,
//            @RequestParam("s_0_rate_b") BigDecimal s0RateB,
//            @RequestParam("s_tax_due_a") BigDecimal sTaxDueA,
//            @RequestParam("s_tax_due_b") BigDecimal sTaxDueB,
//            @RequestParam("s_4_rate_a") BigDecimal s4RateA,
//            @RequestParam("s_4_rate_b") BigDecimal s4RateB,
//            @RequestParam("s_12_5_rate_a") BigDecimal s125RateA,
//            @RequestParam("s_12_5_rate_b") BigDecimal s125RateB,
//            @RequestParam("s_1schedule_v_a") BigDecimal s1ScheduleVA,
//            @RequestParam("s_1schedule_v_b") BigDecimal s1ScheduleVB,
//            @RequestParam("s_2schedule_v_a") BigDecimal s2ScheduleVA,
//            @RequestParam("s_2schedule_v_b") BigDecimal s2ScheduleVB,
//            @RequestParam("s_1_rate_a") BigDecimal s1RateA,
//            @RequestParam("s_1_rate_b") BigDecimal s1RateB,
//            @RequestParam("tot_amt_out_tax") BigDecimal totalAmtOutTax,
//            @RequestParam("s_0_rate_cst_a") BigDecimal s0RateCstA,
//            @RequestParam("s_0_rate_cst_b") BigDecimal s0RateCstB,
//            @RequestParam("rate_s_8_a") BigDecimal rateS8A,
//            @RequestParam("rate_s_9_b") BigDecimal rateS9B,
//            @RequestParam("p_4_rate_pr") BigDecimal p4RatePr,
//            @RequestParam("p_12_5_rate_pr") BigDecimal p125RatePr,
//            @RequestParam("p_1_rate_pr") BigDecimal p1RatePr,
//            @RequestParam("sales_due_rate") BigDecimal salesDueRate,
//            // Add other parameters here
//            Model model) {
//
//        SalesEntity salesDetails = new SalesEntity();
//
//        salesDetails.setS_exempt_rate_a(sExemptRateA);
//        salesDetails.setS_exempt_rate_b(sExemptRateB);
//        salesDetails.setS_0_rate_a(s0RateA);
//        salesDetails.setS_0_rate_b(s0RateB);
//        salesDetails.setS_tax_due_a(sTaxDueA);
//        salesDetails.setS_tax_due_b(sTaxDueB);
//        salesDetails.setS_4_rate_a(s4RateA);
//        salesDetails.setS_4_rate_b(s4RateB);
//        salesDetails.setS_12_5_rate_a(s125RateA);
//        salesDetails.setS_12_5_rate_b(s125RateB);
//        salesDetails.setS_1schedule_v_a(s1ScheduleVA);
//        salesDetails.setS_1schedule_v_b(s1ScheduleVB);
//        salesDetails.setS_2schedule_v_a(s2ScheduleVA);
//        salesDetails.setS_2schedule_v_b(s2ScheduleVB);
//        salesDetails.setS_1_rate_a(s1RateA);
//        salesDetails.setS_1_rate_b(s1RateB);
//        salesDetails.setTot_amt_out_tax(totalAmtOutTax);
//        salesDetails.setS_0_rate_cst_a(s0RateCstA);
//        salesDetails.setS_0_rate_cst_b(s0RateCstB);
//        salesDetails.setRate_s_8_a(rateS8A);
//        salesDetails.setRate_s_9_b(rateS9B);
//        salesDetails.setP_4_rate_pr(p4RatePr);
//        salesDetails.setP_12_5_rate(p125RatePr);
//        salesDetails.setP_1_rate_pr(p1RatePr);
//        salesDetails.setSales_due_rate(salesDueRate);
//        // Set other parameters
//        salesService.saveSalesRecord(salesDetails);
//
//        return "redirect:/data/success";
//    }
//
//
//    @PostMapping("/total-output-tax-online")
//    public String saveTotalOutputTaxOnlineWithParams(
//            @RequestParam("sales_cancelled") Double salesCancelled,
//            @RequestParam("returns_of_sold_goods") Double returnsOfSoldGoods,
//            @RequestParam("oth_adjustment_add") Double otherAdjustmentAdd,
//            @RequestParam("oth_adjustment_sub") Double otherAdjustmentSub,
//            @RequestParam("tot_adjustment") Double totalAdjustment,
//            @RequestParam("total_output_tax") Double totalOutputTax,
//            Model model) {
//
//        TotalOutputTaxOnline totalOutputTaxOnline = new TotalOutputTaxOnline();
//        // set parameters
//        totalOutputTaxOnlineService.save(totalOutputTaxOnline);
//
//        return "redirect:/data/success";
//    }
//
//    @GetMapping("/success")
//    public String showSuccessPage(Model model, @RequestParam("type") String type) {
//        // Display success message if available
//        if (model.containsAttribute("successMessage")) {
//            model.addAttribute("successMessage", model.getAttribute("successMessage"));
//        }
//
//        // Determine the redirect URL based on the type parameter
//        switch (type) {
//            case "purchase":
//                return "redirect:/welcome"; // Replace with your purchase success URL
//            case "quarter":
//                return "redirect:/form2"; // Replace with your quarter success URL
//            case "sales":
//                return "redirect:/form3.html"; // Replace with your sales success URL
//            case "outputTax":
//                return "redirect:/form4.html"; // Replace with your output tax success URL
//            default:
//                return "redirect:/default-success-url"; // Replace with your default success URL
//        }
//    }
//
//}
