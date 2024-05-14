package org.nic.jec.repository;

import org.nic.jec.entity.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<SalesEntity, Long> {
//    void getReferenceById(String returnNumber);
//    // You can define custom query methods here if needed
}

