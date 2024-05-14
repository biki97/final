package org.nic.jec.services;

import org.nic.jec.entity.MasterReturnOnline;
import org.nic.jec.repository.MasterReturnOnlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReturnNumberService {

    @Autowired
    private MasterReturnOnlineRepository masterReturnOnlineRepository;
    public String generateReturnNumber(Long masterId, String combo1, String y, String month2) {
        String returnNo = null;
        try {
            // Use the provided masterId instead of querying it from the repository
            if (masterId != null) {
                int w = (int) (masterId + 1);
                String q = String.valueOf(w);
                String s = "e";
                String t;
                if (q.length() < 5) {
                    // Include masterId in place of combo1
                    t = s.concat(masterId.toString()).concat(y).concat(month2);
                    int zerosToAdd = 5 - q.length();
                    for (int i = 0; i < zerosToAdd; i++) {
                        t = t.concat("0");
                    }
                    t = t.concat(q);
                } else {
                    t = s.concat(masterId.toString()).concat(y).concat(month2).concat(q);
                }

                // Store a substring of t as the return number
                returnNo = t.substring(0, 12);

                // Store the return number in the database
                storeReturnNumber(returnNo, masterId);
                System.out.println("returnno:" + returnNo);
            } else {
                System.out.println("Master ID is null. Cannot generate return number.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions if necessary
        }
        return returnNo;
    }




    private void storeReturnNumber(String returnNo, Long masterId) {
        try {
            // Check if the masterId exists
            Optional<MasterReturnOnline> optionalMasterReturnOnline = masterReturnOnlineRepository.findById(masterId);

            if (optionalMasterReturnOnline.isPresent()) {
                // Update the existing entity with the new returnNo
                MasterReturnOnline masterReturnOnline = optionalMasterReturnOnline.get();
                masterReturnOnline.setReturnNo(returnNo);

                // Save the updated entity
                masterReturnOnlineRepository.save(masterReturnOnline);

                System.out.println("Return number updated successfully.");
            } else {
                System.out.println("No record found with the provided masterId.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions if necessary
        }
    }

}
