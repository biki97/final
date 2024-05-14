package org.nic.jec.controller;

import jakarta.servlet.http.HttpSession;
import org.nic.jec.entity.MasterReturnOnline;
import org.nic.jec.entity.RegdDealer;
import org.nic.jec.repository.MasterReturnOnlineRepository;
import org.nic.jec.repository.RegdDealerRepository;
import org.nic.jec.services.ReturnNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;


@Controller
@RequestMapping("/mrc")
public class MasterReturnOnlineController {
    @Autowired
    private ReturnNumberService returnNumberService;

    @Autowired
    private RegdDealerRepository regdDealerRepository;

    @Autowired
    private MasterReturnOnlineRepository masterReturnOnlineRepository;

    @GetMapping("/abc")
    public String abc(HttpSession session) {
        System.out.println(session.getAttribute("tin_number"));
        return "abc";
    }

    @PostMapping("/save-date")
    public String submitDate(@RequestParam String fromMonth,
                             @RequestParam int fromYear,
                             @RequestParam String toMonth,
                             @RequestParam int toYear,
                             HttpSession session, MasterReturnOnline masterReturnOnline) throws SQLException {

        System.out.println("fromMonth:" + fromMonth);
        System.out.println("fromYear:" + fromYear);
        System.out.println("toMonth:" + toMonth);
        System.out.println("toYear:" + toYear);

        String tinNumber = session.getAttribute("tin_number").toString();
        RegdDealer regdDealer = regdDealerRepository.findByVatRcNo(tinNumber);

        if (regdDealer != null && tinNumber.equals(regdDealer.getVatRcNo())) {

            // Save the entity to the database
            masterReturnOnlineRepository.save(masterReturnOnline); // Save only once

            // Convert month names to numerical form
            String numericalFromMonth = getMonthNumber(fromMonth);
            String numericalToMonth = getMonthNumber(toMonth);

            // Generate the return number using ReturnNumberService
            Long masterId = masterReturnOnline.getId(); // Obtain the masterId
            String returnNo = returnNumberService.generateReturnNumber(masterId, String.valueOf(regdDealer.getCombo1()), String.valueOf(fromYear), numericalFromMonth);

            System.out.println("Return no: " + returnNo);
        }

        return "form1";
    }

    // Helper method to convert month names to numerical representations
    private String getMonthNumber(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january":
                return "01";
            case "february":
                return "02";
            case "march":
                return "03";
            case "april":
                return "04";
            case "may":
                return "05";
            case "june":
                return "06";
            case "july":
                return "07";
            case "august":
                return "08";
            case "september":
                return "09";
            case "october":
                return "10";
            case "november":
                return "11";
            case "december":
                return "12";
            default:
                return ""; // Handle unknown month names if needed
        }
    }



}
    //prabir one
//    @PostMapping("/save-date")
//    public String submitDate(@RequestParam String fromMonth,
//                             @RequestParam int fromYear,
//                             @RequestParam String toMonth,
//                             @RequestParam int toYear,
//                             HttpSession session) throws SQLException {
//
//        System.out.println("fromMonth:" + fromMonth);
//        System.out.println("fromYear:" + fromYear);
//        System.out.println("toMonth:" + toMonth);
//        System.out.println("toYear:" + toYear);
//
//        session.setAttribute("fromMonth", fromMonth);
//        session.setAttribute("fromYear", fromYear);
//        session.setAttribute("toMonth", toMonth);
//        session.setAttribute("fromMonth", toYear);
//
//        String tinNumber = session.getAttribute("tin_number").toString();
//        RegdDealer regdDealer = regdDealerRepository.findByVatRcNo(tinNumber);
//
//        //String id = String.valueOf(regdDealer.getId());
//
//
//        if (regdDealer != null && tinNumber.equals(regdDealer.getVatRcNo())) {
//            // Generate the return number using ReturnNumberService
//            // Generate the return number using ReturnNumberService
//            String returnNo = returnNumberService.generateReturnNumber(String.valueOf(regdDealer.getCombo1()), String.valueOf(fromYear), fromMonth);
//            // Create a new instance of MasterReturnOnline entity
//            MasterReturnOnline masterReturnOnline = new MasterReturnOnline();
//            masterReturnOnline.setReturnNo(returnNo);
//            masterReturnOnline.setFromMonth(fromMonth);
//            masterReturnOnline.setFromYear(fromYear);
//            masterReturnOnline.setToMonth(toMonth);
//            masterReturnOnline.setToYear(toYear);
//            masterReturnOnline.setReturnNo(returnNo); // Set the generated return number
//
//            // Save the entity to the database
//            masterReturnOnlineRepository.save(masterReturnOnline);
//            System.out.println("tish"+masterReturnOnlineRepository.save(masterReturnOnline).toString());
//
//            Long masterId = masterReturnOnline.getId();
//
//            System.out.println("Return no: " + returnNo);
//        }
//
//
//        return "form1";
//    }



