package org.nic.jec.controller;

import org.nic.jec.entity.TotalOutputTaxOnline;
import org.nic.jec.repository.TotalOutputTaxOnlineRepository;
import org.nic.jec.services.TotalOutputTaxOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/total-output-tax-online")
public class TotalOutputTaxOnlineController {


    private final TotalOutputTaxOnlineRepository totalOutputTaxOnlineRepository;
    private final TotalOutputTaxOnlineService totalOutputTaxOnlineService;

    @Autowired
    public TotalOutputTaxOnlineController(TotalOutputTaxOnlineService totalOutputTaxOnlineService, TotalOutputTaxOnlineRepository totalOutputTaxOnlineRepository) {
        this.totalOutputTaxOnlineRepository=totalOutputTaxOnlineRepository;
        this.totalOutputTaxOnlineService = totalOutputTaxOnlineService;
    }

    @PostMapping("/total-output-tax-online")
    public String saveTotalOutputTaxOnline(
            @RequestParam("sales_cancelled") Double salesCancelled,
            @RequestParam("returns_of_sold_goods") Double returnsOfSoldGoods,
            @RequestParam("oth_adjustment_add") Double otherAdjustmentAdd,
            @RequestParam("oth_adjustment_sub") Double otherAdjustmentSub,
            @RequestParam("tot_adjustment") Double totalAdjustment,
            @RequestParam("total_output_tax") Double totalOutputTax,
            Model model) {

        TotalOutputTaxOnline totalOutputTaxOnline = new TotalOutputTaxOnline();
        // Set parameters
        totalOutputTaxOnlineService.save(totalOutputTaxOnline);

        return "redirect:/data/success";
    }

    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        // Display success message if available
        if (model.containsAttribute("successMessage")) {
            model.addAttribute("successMessage", model.getAttribute("successMessage"));
        }
        return "redirect:/form4.html";
    }

}
