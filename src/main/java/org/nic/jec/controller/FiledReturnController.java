package org.nic.jec.controller;

import org.nic.jec.entity.MasterReturnOnline;
import org.nic.jec.services.MasterReturnOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FiledReturnController {

    @Autowired
    private MasterReturnOnlineService masterReturnOnlineService;

    @GetMapping("/filed-returns")
    public String getFiledReturns(Model model) {
        // Retrieve filed returns from the service
        List<MasterReturnOnline> filedReturns = masterReturnOnlineService.getAllMasterReturnOnline();

        // Add the filed returns to the model
        model.addAttribute("filedReturns", filedReturns);

        // Return the Thymeleaf template name
        return "filed_returns";
    }
}
