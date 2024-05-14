package org.nic.jec.helper;


import org.nic.jec.entity.MT_Userlogin;
import org.nic.jec.services.CommonService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

public class AuthenticationHelper {
	
	public static boolean authenticated() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication != null && authentication.isAuthenticated()
				&& !(authentication instanceof AnonymousAuthenticationToken);
	}
	
	public static String getUserDetails(Model model, CommonService commonService) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.isAuthenticated() && !(auth instanceof AnonymousAuthenticationToken)) {
			MT_Userlogin userLogin = commonService.getUserByUsername(auth.getName());
			model.addAttribute("username", userLogin.getUsername());
			model.addAttribute("role", userLogin.getRole_code().getRole_name());
			model.addAttribute("role_code", userLogin.getRole_code().getRole_code());

			model.addAttribute("userid", userLogin.getUserid());
			return userLogin.getUsername();
		}
		return null;
	}

	public static String getUserid(Model model, CommonService commonService){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.isAuthenticated() && !(auth instanceof AnonymousAuthenticationToken)) {
			MT_Userlogin userLogin = commonService.getUserByUsername(auth.getName());
			return userLogin.getUserid();
		}
		return null;
	}

	public static String getUserRoleCode(Model model, CommonService commonService) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.isAuthenticated() && !(auth instanceof AnonymousAuthenticationToken)) {
			MT_Userlogin userLogin = commonService.getUserByUsername(auth.getName());
			return userLogin.getRole_code().getRole_code();
		}
		return null;
	}




}
