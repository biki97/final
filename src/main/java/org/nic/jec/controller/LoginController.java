package org.nic.jec.controller;


import jakarta.servlet.http.HttpSession;
import org.nic.jec.entity.RegdDealer;
import org.nic.jec.entity.VatUser;
import org.nic.jec.repository.RegOnlineLoginRepository;
import org.nic.jec.repository.RegdDealerRepository;
import org.nic.jec.repository.VatUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @Autowired
    private VatUserRepository vatUserRepository;

    @Autowired
    private RegdDealerRepository regdDealerRepository;

    @Autowired
    private RegOnlineLoginRepository regOnlineLoginRepository;
    @Autowired
    private RegOnlineLoginRepository regOnlineLogin;


    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password,
                        @RequestParam Character tinNumber, HttpSession session) {

        System.out.println("Username: " + username);
        System.out.println("password: " + password);
        System.out.println("tinNumber: " + tinNumber);
        VatUser vatUser = vatUserRepository.findByUsername(username);
        if (vatUser != null && BCrypt.checkpw(password, vatUser.getPassword())) {
            // Check if the VAT RC number matches
            if (tinNumber.equals(vatUser.getTin_number())) {
                // Store necessary data in session
                session.setAttribute("username", username);
                //session.setAttribute("vatRcNo", tinNumber); // Storing VAT RC number
                session.setAttribute("userId", vatUser.getVatUserId());
                session.setAttribute("tinNumber", tinNumber); // Storing tinNumber
                // Redirect to welcome page
                return "redirect:/welcome";
            } else {
                return "redirect:/login?error=VAT RC Number does not match";
            }
        } else {
            return "redirect:/login?error=Invalid username or password";
        }
    }


    @GetMapping("/welcome")
    public String welcome(Model model, HttpSession session) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();


        VatUser vatUser = vatUserRepository.findByUsername(name);
        session.setAttribute("tin_number", vatUser.getVatRc());
        String tinNumber = session.getAttribute("tin_number").toString();
        System.out.println("tinnumber:" + tinNumber);


        if (vatUser != null) {
            session.setAttribute("tin_number", vatUser.getVatRc());
            model.addAttribute("username", name);
            System.out.println("username:" + name);
            System.out.println("vatuser" + vatUser);
            // Retrieve data from regd_dealer table using tinNumber
            RegdDealer regdDealer = regdDealerRepository.findByVatRcNo(tinNumber);
            System.out.println("regd_dealer:" + regdDealer);

        } else {
            // Handle the case where vatUser is null
            // You might want to redirect to an error page or perform some other action
        }


        return "welcome";
    }


//    @GetMapping("/login-circle-officer")
//    public String showCircleOfficerLoginForm() {
//        return "login-circle-officer";
//    }
//
//    @PostMapping("/login-circle-officer")
//    public String circleOfficerLogin(@RequestParam String cname, @RequestParam String cPassword,
//                                     @RequestParam String cCode, HttpSession session) {
//
//        System.out.println("Circle Officer Username: " + cname);
//        System.out.println("Circle Officer Password: " + cPassword);
//        System.out.println("Circle Code: " + cCode);
//
//        RegOnlineLogin regOnlineLogin = regOnlineLoginRepository.findByCircleCd(cCode);
//        System.out.println("regonline:"+ regOnlineLogin );
//        if (regOnlineLogin != null && BCrypt.checkpw(cPassword, regOnlineLogin.getPassword())) {
//            if (cCode.equals(regOnlineLogin.getCircleCd())) {
//                // Store necessary data in session
//                session.setAttribute("username", cname);
//                session.setAttribute("circleCd", cCode); // Storing circle code
//                // Redirect to dealer files page
//                return "redirect:/dashboard";
//            } else {
//                // Redirect with an error message if circle code doesn't match
//                return "redirect:/login-circle-officer?error=Invalid circle code";
//            }
//        } else {
//            // Redirect with an error message if username, password, or both are invalid
//            return "redirect:/login-circle-officer?error=Invalid username or password";
//        }
//    }
//


}