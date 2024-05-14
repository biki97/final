package org.nic.jec.repository;

import org.nic.jec.entity.TotalOutputTaxOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalOutputTaxOnlineRepository extends JpaRepository<TotalOutputTaxOnline, Long> {
//    void getReferenceById(String returnNumber);
//    // You can add custom query methods here if needed
}
