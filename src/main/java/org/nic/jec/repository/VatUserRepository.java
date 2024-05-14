package org.nic.jec.repository;


import org.nic.jec.entity.VatUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VatUserRepository extends JpaRepository<VatUser, Long> {
    VatUser findByUsername(String username);

    default boolean checkVatRcMatch(String vatRcNo, RegdDealerRepository regdDealerRepository) {
        return regdDealerRepository.findByVatRcNo(vatRcNo) != null;
    }
}

