package org.nic.jec.repository;


import org.nic.jec.entity.RegdDealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegdDealerRepository extends JpaRepository<RegdDealer, Long> {

    // Define the custom query method to retrieve data based on the VAT RC number
    RegdDealer findByVatRcNo(String vatRcNo);


}








