package org.nic.jec.controller;

import org.nic.jec.entity.SalesEntity;
import org.nic.jec.repository.SalesRepository;
import org.nic.jec.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;


@Controller
@RequestMapping("/sales")
public class SalesController {

    private final SalesRepository salesRepository;
    private final SalesService salesService; // Declare salesService at the class level

    @Autowired
    public SalesController(SalesRepository salesRepository, SalesService salesService) {
        this.salesRepository = salesRepository;
        this.salesService = salesService; // Initialize salesService in the constructor
    }

    @PostMapping("/submit")
    public String submitSalesDetails(
            @RequestParam("s_exempt_rate_a") BigDecimal sExemptRateA,
            @RequestParam("s_exempt_rate_b") BigDecimal sExemptRateB,
            @RequestParam("s_0_rate_a") BigDecimal s0RateA,
            @RequestParam("s_0_rate_b") BigDecimal s0RateB,
            @RequestParam("s_tax_due_a") BigDecimal sTaxDueA,
            @RequestParam("s_tax_due_b") BigDecimal sTaxDueB,
            @RequestParam("s_4_rate_a") BigDecimal s4RateA,
            @RequestParam("s_4_rate_b") BigDecimal s4RateB,
            @RequestParam("s_12_5_rate_a") BigDecimal s125RateA,
            @RequestParam("s_12_5_rate_b") BigDecimal s125RateB,
            @RequestParam("s_1schedule_v_a") BigDecimal s1ScheduleVA,
            @RequestParam("s_1schedule_v_b") BigDecimal s1ScheduleVB,
            @RequestParam("s_2schedule_v_a") BigDecimal s2ScheduleVA,
            @RequestParam("s_2schedule_v_b") BigDecimal s2ScheduleVB,
            @RequestParam("s_1_rate_a") BigDecimal s1RateA,
            @RequestParam("s_1_rate_b") BigDecimal s1RateB,
            @RequestParam("tot_amt_out_tax") BigDecimal totalAmtOutTax,
            @RequestParam("s_0_rate_cst_a") BigDecimal s0RateCstA,
            @RequestParam("s_0_rate_cst_b") BigDecimal s0RateCstB,
            @RequestParam("rate_s_8_a") BigDecimal rateS8A,
            @RequestParam("rate_s_9_b") BigDecimal rateS9B,
            @RequestParam("p_4_rate_pr") BigDecimal p4RatePr,
            @RequestParam("p_12_5_rate_pr") BigDecimal p125RatePr,
            @RequestParam("p_1_rate_pr") BigDecimal p1RatePr,
            @RequestParam("sales_due_rate") BigDecimal salesDueRate
    )
    {


        SalesEntity salesDetails = new SalesEntity();

        salesDetails.setS_exempt_rate_a(sExemptRateA);
        salesDetails.setS_exempt_rate_b(sExemptRateB);
        salesDetails.setS_0_rate_a(s0RateA);
        salesDetails.setS_0_rate_b(s0RateB);
        salesDetails.setS_tax_due_a(sTaxDueA);
        salesDetails.setS_tax_due_b(sTaxDueB);
        salesDetails.setS_4_rate_a(s4RateA);
        salesDetails.setS_4_rate_b(s4RateB);
        salesDetails.setS_12_5_rate_a(s125RateA);
        salesDetails.setS_12_5_rate_b(s125RateB);
        salesDetails.setS_1schedule_v_a(s1ScheduleVA);
        salesDetails.setS_1schedule_v_b(s1ScheduleVB);
        salesDetails.setS_2schedule_v_a(s2ScheduleVA);
        salesDetails.setS_2schedule_v_b(s2ScheduleVB);
        salesDetails.setS_1_rate_a(s1RateA);
        salesDetails.setS_1_rate_b(s1RateB);
        salesDetails.setTot_amt_out_tax(totalAmtOutTax);
        salesDetails.setS_0_rate_cst_a(s0RateCstA);
        salesDetails.setS_0_rate_cst_b(s0RateCstB);
        salesDetails.setRate_s_8_a(rateS8A);
        salesDetails.setRate_s_9_b(rateS9B);
        salesDetails.setP_4_rate_pr(p4RatePr);
        salesDetails.setP_12_5_rate(p125RatePr);
        salesDetails.setP_1_rate_pr(p1RatePr);
        salesDetails.setSales_due_rate(salesDueRate);
        salesService.saveSalesRecord(salesDetails);

        return "redirect:/sales/success";
    }
    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        // Display success message if available
        if (model.containsAttribute("successMessage")) {
            model.addAttribute("successMessage", model.getAttribute("successMessage"));
        }
        return "redirect:/form3.html";
    }
}
