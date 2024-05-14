package org.nic.jec.services;

import org.nic.jec.entity.PurchaseQuarterDetails;
import org.nic.jec.repository.PurchaseQuarterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseQuarterDetailsService {

    @Autowired
    private PurchaseQuarterDetailsRepository purchaseQuarterDetailsRepository;

    public void savePurchaseQuarterDetails(PurchaseQuarterDetails purchaseQuarterDetails) {
        purchaseQuarterDetailsRepository.save(purchaseQuarterDetails);
    }
}

