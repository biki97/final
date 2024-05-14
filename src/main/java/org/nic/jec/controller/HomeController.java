package org.nic.jec.controller;


import org.nic.jec.helper.AuthenticationHelper;
import org.nic.jec.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private CommonService commonService;

    @GetMapping("home")
    public String getHome(Model model) {
        String str = "/login";
        try {
            String username = AuthenticationHelper.getUserDetails(model, commonService);
            String role_code = AuthenticationHelper.getUserRoleCode(model, commonService);
            if (username != null) {
                switch (role_code){
                    case "1" :
                        model.addAttribute("username",username);
                        str = "dashboard";
                        break;

                    case "2" :
                        model.addAttribute("username",username);
                        str = "welcome";
                        break;

                }
            }else {
                model.addAttribute("msg", "Invalid Login / Session Expired. Please Login Again");
                return "/login";
            }
        } catch (Exception e) {
            return "redirect:/?error=" + e.getMessage();
        }
        return str;
    }

}
