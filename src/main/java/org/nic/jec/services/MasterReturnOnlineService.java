package org.nic.jec.services;

import jakarta.servlet.http.HttpSession;
import org.nic.jec.entity.MasterReturnOnline;
import org.nic.jec.entity.RegdDealer;
import org.nic.jec.repository.MasterReturnOnlineRepository;
import org.nic.jec.repository.RegdDealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MasterReturnOnlineService {

    private final ReturnNumberService returnNumberService;
    private final RegdDealerRepository regdDealerRepository;
    private final MasterReturnOnlineRepository masterReturnOnlineRepository;

    @Autowired
    public MasterReturnOnlineService(ReturnNumberService returnNumberService,
                                     RegdDealerRepository regdDealerRepository,
                                     MasterReturnOnlineRepository masterReturnOnlineRepository) {
        this.returnNumberService = returnNumberService;
        this.regdDealerRepository = regdDealerRepository;
        this.masterReturnOnlineRepository = masterReturnOnlineRepository;
    }

    public void submitDate(String fromMonth, int fromYear, String toMonth, int toYear, HttpSession session) throws SQLException {
        String tinNumber = session.getAttribute("tin_number").toString();
        RegdDealer regdDealer = regdDealerRepository.findByVatRcNo(tinNumber);

        if (regdDealer != null && tinNumber.equals(regdDealer.getVatRcNo())) {
            MasterReturnOnline masterReturnOnline = new MasterReturnOnline();
            masterReturnOnline.setFromMonth(fromMonth);
            masterReturnOnline.setFromYear(fromYear);
            masterReturnOnline.setToMonth(toMonth);
            masterReturnOnline.setToYear(toYear);

            masterReturnOnlineRepository.save(masterReturnOnline);

            Long masterId = masterReturnOnline.getId();
            String returnNo = returnNumberService.generateReturnNumber(masterId, String.valueOf(regdDealer.getCombo1()), String.valueOf(fromYear), getMonthNumber(fromMonth));

            masterReturnOnline.setReturnNo(returnNo);
            masterReturnOnlineRepository.save(masterReturnOnline);
        }
    }

    public List<MasterReturnOnline> getAllMasterReturnOnline() {
        return masterReturnOnlineRepository.findAll();
    }

    private String getMonthNumber(String monthName) {
        // Implementation of getMonthNumber method
        return monthName;
    }
}
