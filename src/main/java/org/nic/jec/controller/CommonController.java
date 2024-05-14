package org.nic.jec.controller;

import lombok.AllArgsConstructor;
import org.nic.jec.services.CommonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("seller")
public class CommonController {
    private CommonService commonService;
	
	@GetMapping("/")
    public String index() {
        return "index";
    }
	
}
