package org.nic.jec.mapper;

import org.nic.jec.entity.MT_Userlogin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserLoginUserDetails implements UserDetails{

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private List<GrantedAuthority> authorities;


    public UserLoginUserDetails(MT_Userlogin userLogin) {
        username = userLogin.getUsername();
        password = userLogin.getPassword();
        authorities = Arrays.stream(
                        userLogin.getRole_code().getRole_description().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return authorities;
    }

    public String getPassword() {
        // TODO Auto-generated method stub
        return password;
    }

    public String getUsername() {
        // TODO Auto-generated method stub
        return username;
    }

    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
}
