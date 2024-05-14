package org.nic.jec.services;

import org.nic.jec.entity.RegOnlineLogin;
import org.nic.jec.repository.RegOnlineLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegOnlineLoginService {

    private final RegOnlineLoginRepository regOnlineLoginRepository;

    @Autowired
    public RegOnlineLoginService(RegOnlineLoginRepository regOnlineLoginRepository) {
        this.regOnlineLoginRepository = regOnlineLoginRepository;
    }

    public List<RegOnlineLogin> findAll() {
        return regOnlineLoginRepository.findAll();
    }


    public RegOnlineLogin findByUserCd(String cname) {
        return regOnlineLoginRepository.findByUserCd(cname);
    }

    // Add more methods as needed
}
