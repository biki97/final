package org.nic.jec.services;

import org.nic.jec.entity.PurchaseDetails;
import org.nic.jec.repository.PurchaseDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseDetailsService {

    private final PurchaseDetailsRepository purchaseDetailsRepository;

    @Autowired
    public PurchaseDetailsService(PurchaseDetailsRepository purchaseDetailsRepository) {
        this.purchaseDetailsRepository = purchaseDetailsRepository;
    }

    public PurchaseDetails savePurchaseDetails(PurchaseDetails purchaseDetails) {
        return purchaseDetailsRepository.save(purchaseDetails);
    }

    public Optional<PurchaseDetails> findPurchaseDetailsById(Long id) {
        return purchaseDetailsRepository.findById(id);
    }

    public List<PurchaseDetails> findAllPurchaseDetails() {
        return purchaseDetailsRepository.findAll();
    }

    public void deletePurchaseDetails(Long id) {
        purchaseDetailsRepository.deleteById(id);
    }

    // Add more methods as needed
}
