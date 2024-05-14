package org.nic.jec.repository;

import org.nic.jec.entity.RegOnlineLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegOnlineLoginRepository extends JpaRepository<RegOnlineLogin, Long> {
  //  RegOnlineLogin findByUserCd(String userCd);

    //RegOnlineLogin findByuserCd(String cname);

    RegOnlineLogin findByUserCd(String cname);

    RegOnlineLogin findByCircleCd(String cCode);
}

