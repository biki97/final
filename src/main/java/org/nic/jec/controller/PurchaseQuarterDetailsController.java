package org.nic.jec.controller;
import org.nic.jec.entity.PurchaseQuarterDetails;

import org.nic.jec.services.PurchaseQuarterDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
@RequestMapping("/purchase")
public class PurchaseQuarterDetailsController {

    @Autowired
    private PurchaseQuarterDetailsService purchaseQuarterDetailsService;

    @GetMapping("/form")
    public String showPurchaseForm(Model model) {
        return "purchase_form";
    }

    @PostMapping("/submit")
    public String submitPurchaseForm(
            @RequestParam("p_exempt_rate_a") BigDecimal pExemptRateA,
            @RequestParam("p_exempt_rate_b") Double pExemptRateB,
            @RequestParam("p_4_rate_a") Double p4RateA,
            @RequestParam("p_4_rate_b") Double p4RateB,
            @RequestParam("p_12_5_rate_a") Double p125RateA,
            @RequestParam("p_12_5_rate_b") Double p125RateB,
            @RequestParam("p_1_rate_a") Double p1RateA,
            @RequestParam("p_1_rate_b") Double p1RateB,
            @RequestParam("rate_p_8_a") Double rate8A,
            @RequestParam("rate_p_8_b") Double rate8B,
            @RequestParam("rate_p_9_a") Double rate9A,
            @RequestParam("rate_p_9_b") Double rate9B,
            @RequestParam("tot_amt_imp_tax") Double totalAmountOfInputTax) {

        System.out.println (pExemptRateA+ "pExemptRateA");

        PurchaseQuarterDetails purchaseQuarterDetails = new PurchaseQuarterDetails();
        purchaseQuarterDetails.setExemptRateA(pExemptRateA);
        purchaseQuarterDetails.setExemptRateB(pExemptRateB);
        purchaseQuarterDetails.setRate4A(p4RateA);
        purchaseQuarterDetails.setRate4B(p4RateB);
        purchaseQuarterDetails.setRate125A(p125RateA);
        purchaseQuarterDetails.setRate125B(p125RateB);
        purchaseQuarterDetails.setRate1A(p1RateA);
        purchaseQuarterDetails.setRate1B(p1RateB);
        purchaseQuarterDetails.setRate8A(rate8A);
        purchaseQuarterDetails.setRate8B(rate8B);
        purchaseQuarterDetails.setRate9A(rate9A);
        purchaseQuarterDetails.setRate9B(rate9B);
        purchaseQuarterDetails.setTotalAmountOfInputTax(totalAmountOfInputTax);

        purchaseQuarterDetailsService.savePurchaseQuarterDetails(purchaseQuarterDetails);

        return "redirect:/purchase/success"; // Redirect to a success page
    }



    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        // Display success message if available
        if (model.containsAttribute("successMessage")) {
            model.addAttribute("successMessage", model.getAttribute("successMessage"));
        }
        return "redirect:/form2";
    }
}
