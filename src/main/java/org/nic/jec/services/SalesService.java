package org.nic.jec.services;

import org.nic.jec.entity.SalesEntity;
import org.nic.jec.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SalesService {

    private final SalesRepository salesRepository;

    @Autowired
    public SalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    public void saveSalesRecord(SalesEntity salesEntity) {
        salesRepository.save(salesEntity);
    }

    public List<SalesEntity> getSalesByParams(String returnNo, BigDecimal exemptRateA, BigDecimal exemptRateB, BigDecimal zeroRateA, BigDecimal zeroRateB, BigDecimal zeroRateCstA, BigDecimal zeroRateCstB, BigDecimal rate8A, BigDecimal taxDueA, BigDecimal taxDueB, BigDecimal rate9B, BigDecimal rate4A, BigDecimal rate4B, BigDecimal ratePr, BigDecimal rate125A, BigDecimal rate125B, BigDecimal rate125Pr, BigDecimal scheduleVA, BigDecimal scheduleVB, BigDecimal salesDueRate, BigDecimal schedule2VA, BigDecimal schedule2VB, BigDecimal totalAmountOutTax) {
        return null;
    }
}