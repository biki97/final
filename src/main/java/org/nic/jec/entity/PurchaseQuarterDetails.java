package org.nic.jec.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ret_purchase_qtr_details_on")
public class PurchaseQuarterDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Assuming there's an auto-generated ID in your table

    @ManyToOne
    @JoinColumn(name = "return_no", referencedColumnName = "return_no") // Assuming 'return_no' is the column name in both tables
    private MasterReturnOnline masterReturnOnline; // Establishing a Many-to-One relationship with MasterReturnOnline entity


    @Column(name = "p_exempt_rate_a")
    private BigDecimal exemptRateA;

    @Column(name = "p_exempt_rate_b")
    private Double exemptRateB;

    @Column(name = "p_4_rate_a")
    private Double rate4A;

    @Column(name = "p_4_rate_b")
    private Double rate4B;

    @Column(name = "p_12_5_rate_a")
    private Double rate125A;

    @Column(name = "p_12_5_rate_b")
    private Double rate125B;

    @Column(name = "p_1_rate_a")
    private Double rate1A;

    @Column(name = "p_1_rate_b")
    private Double rate1B;

    @Column(name = "rate_p_8_a")
    private Double rate8A;

    @Column(name = "rate_p_8_b")
    private Double rate8B;

    @Column(name = "rate_p_9_a")
    private Double rate9A;

    @Column(name = "rate_p_9_b")
    private Double rate9B;

    @Column(name = "tot_amt_imp_tax")
    private Double totalAmountOfInputTax;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MasterReturnOnline getMasterReturnOnline() {
        return masterReturnOnline;
    }

    public void setMasterReturnOnline(MasterReturnOnline masterReturnOnline) {
        this.masterReturnOnline = masterReturnOnline;
    }

    public BigDecimal getExemptRateA() {
        return exemptRateA;
    }

    public void setExemptRateA(BigDecimal exemptRateA) {
        this.exemptRateA = exemptRateA;
    }

    public Double getExemptRateB() {
        return exemptRateB;
    }

    public void setExemptRateB(Double exemptRateB) {
        this.exemptRateB = exemptRateB;
    }

    public Double getRate4A() {
        return rate4A;
    }

    public void setRate4A(Double rate4A) {
        this.rate4A = rate4A;
    }

    public Double getRate4B() {
        return rate4B;
    }

    public void setRate4B(Double rate4B) {
        this.rate4B = rate4B;
    }

    public Double getRate125A() {
        return rate125A;
    }

    public void setRate125A(Double rate125A) {
        this.rate125A = rate125A;
    }

    public Double getRate125B() {
        return rate125B;
    }

    public void setRate125B(Double rate125B) {
        this.rate125B = rate125B;
    }

    public Double getRate1A() {
        return rate1A;
    }

    public void setRate1A(Double rate1A) {
        this.rate1A = rate1A;
    }

    public Double getRate1B() {
        return rate1B;
    }

    public void setRate1B(Double rate1B) {
        this.rate1B = rate1B;
    }

    public Double getRate8A() {
        return rate8A;
    }

    public void setRate8A(Double rate8A) {
        this.rate8A = rate8A;
    }

    public Double getRate8B() {
        return rate8B;
    }

    public void setRate8B(Double rate8B) {
        this.rate8B = rate8B;
    }

    public Double getRate9A() {
        return rate9A;
    }

    public void setRate9A(Double rate9A) {
        this.rate9A = rate9A;
    }

    public Double getRate9B() {
        return rate9B;
    }

    public void setRate9B(Double rate9B) {
        this.rate9B = rate9B;
    }

    public Double getTotalAmountOfInputTax() {
        return totalAmountOfInputTax;
    }


    public void setTotalAmountOfInputTax(Double totalAmountOfInputTax) {
        this.totalAmountOfInputTax = totalAmountOfInputTax;
    }

}
