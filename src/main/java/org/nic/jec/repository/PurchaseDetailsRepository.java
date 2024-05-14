package org.nic.jec.repository;

import org.nic.jec.entity.PurchaseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseDetailsRepository extends JpaRepository<PurchaseDetails, Long> {
//    void getReferenceById(String returnNumber);
//    // You can define custom query methods if needed
}
