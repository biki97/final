package org.nic.jec.services;


import org.nic.jec.entity.MT_Userlogin;
import org.nic.jec.mapper.UserLoginUserDetails;
import org.nic.jec.repository.RoleRepository;
import org.nic.jec.repository.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLoginDetailsService implements UserDetailsService {

    @Autowired
    private UserLoginRepo userLoginRepo;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("USERID:: " + username);
        Optional<MT_Userlogin> userLogin = userLoginRepo.findByUsername(username);
        System.out.println("OBJECT:: " + userLogin.get().toString());
        return userLogin.map(UserLoginUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username Not Found"));
    }
}
