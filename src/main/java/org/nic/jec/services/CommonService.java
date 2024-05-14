package org.nic.jec.services;

import org.nic.jec.entity.MT_Userlogin;

import lombok.AllArgsConstructor;
import org.nic.jec.entity.MT_Userlogin;
import org.nic.jec.repository.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommonService {
	
	@Autowired
	private UserLoginRepo userLoginRepo;

	
	
	public MT_Userlogin getUserByUsername(String username) {
		try {
			return userLoginRepo.findByUsername(username).get();
		} catch (Exception e) {
			throw new RuntimeException("Cannot Fetch User");
		}
	}

}
