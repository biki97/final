package org.nic.jec.services;


import org.nic.jec.entity.TotalOutputTaxOnline;
import org.nic.jec.repository.TotalOutputTaxOnlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TotalOutputTaxOnlineService {

    private final TotalOutputTaxOnlineRepository totalOutputTaxOnlineRepository;

    @Autowired
    public TotalOutputTaxOnlineService(TotalOutputTaxOnlineRepository totalOutputTaxOnlineRepository) {
        this.totalOutputTaxOnlineRepository = totalOutputTaxOnlineRepository;
    }

    @Transactional
    public void save(TotalOutputTaxOnline totalOutputTaxOnline) {
        totalOutputTaxOnlineRepository.save(totalOutputTaxOnline);
    }
}
