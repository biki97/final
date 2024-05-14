package org.nic.jec.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Table(name = "regd_dealer")
@EntityScan
@ToString
@Data
@Entity
public class RegdDealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vat_rc_no")
    private String vatRcNo;

    @Column(name = "circle_cd")
    private String circleCd; // Add the circleCd field

    private Character combo1;

    // Getter method for combo1 property
    public Character getCombo1() {
        return combo1;
    }

    // Setter method for combo1 property (if needed)
    public void setCombo1(Character combo1) {
        this.combo1 = combo1;
    }
    public String getCircleCd() {
        return circleCd;
    }

    public void setCircleCd(String circleCd) {
        this.circleCd = circleCd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVatRcNo() {
        return vatRcNo;
    }

    public void setVatRcNo(String vatRcNo) {
        this.vatRcNo = vatRcNo;
    }

    // Other getters and setters
}
