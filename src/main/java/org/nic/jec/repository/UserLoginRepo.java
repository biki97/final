package org.nic.jec.repository;

import org.nic.jec.entity.MT_Userlogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoginRepo extends JpaRepository<MT_Userlogin, String> {

    Optional<MT_Userlogin> findByUsername(String username);
}
