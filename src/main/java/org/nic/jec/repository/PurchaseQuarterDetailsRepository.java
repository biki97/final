package org.nic.jec.repository;

import org.nic.jec.entity.PurchaseQuarterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseQuarterDetailsRepository extends JpaRepository<PurchaseQuarterDetails, String> {
    // You can add custom query methods here if needed
}

