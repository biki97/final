package org.nic.jec.entity;

import jakarta.persistence.*;


import java.math.BigDecimal;

@Entity
@Table(name = "ret_sales_qtr_details_online")
public class SalesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "return_no", referencedColumnName = "return_no") // Assuming 'return_no' is the column name in both tables
    private MasterReturnOnline masterReturnOnline; // Establishing a Many-to-One relationship with MasterReturnOnline entity


    private BigDecimal s_exempt_rate_a;


    private BigDecimal s_exempt_rate_b;


    private BigDecimal s_0_rate_a;


    private BigDecimal s_0_rate_b;


    private BigDecimal s_0_rate_cst_a;


    private BigDecimal s_0_rate_cst_b;


    private BigDecimal rate_s_8_a;


    private BigDecimal s_tax_due_a;


    private BigDecimal s_tax_due_b;


    private BigDecimal rate_s_9_b;


    private BigDecimal s_4_rate_a;


    private BigDecimal s_4_rate_b;


    private BigDecimal p_4_rate_pr;


    private BigDecimal s_12_5_rate_a;


    private BigDecimal s_12_5_rate_b;


    private BigDecimal p_12_5_rate;


    private BigDecimal s_1_rate_a;


    private BigDecimal s_1_rate_b;


    private BigDecimal p_1_rate_pr;


    private BigDecimal s_1schedule_v_a;


    private BigDecimal s_1schedule_v_b;


    private BigDecimal sales_due_rate;


    private BigDecimal s_2schedule_v_a;


    private BigDecimal s_2schedule_v_b;

    private BigDecimal tot_amt_out_tax;


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

    public BigDecimal getS_exempt_rate_a() {
        return s_exempt_rate_a;
    }

    public void setS_exempt_rate_a(BigDecimal s_exempt_rate_a) {
        this.s_exempt_rate_a = s_exempt_rate_a;
    }

    public BigDecimal getS_exempt_rate_b() {
        return s_exempt_rate_b;
    }

    public void setS_exempt_rate_b(BigDecimal s_exempt_rate_b) {
        this.s_exempt_rate_b = s_exempt_rate_b;
    }

    public BigDecimal getS_0_rate_a() {
        return s_0_rate_a;
    }

    public void setS_0_rate_a(BigDecimal s_0_rate_a) {
        this.s_0_rate_a = s_0_rate_a;
    }

    public BigDecimal getS_0_rate_b() {
        return s_0_rate_b;
    }

    public void setS_0_rate_b(BigDecimal s_0_rate_b) {
        this.s_0_rate_b = s_0_rate_b;
    }

    public BigDecimal getS_0_rate_cst_a() {
        return s_0_rate_cst_a;
    }

    public void setS_0_rate_cst_a(BigDecimal s_0_rate_cst_a) {
        this.s_0_rate_cst_a = s_0_rate_cst_a;
    }

    public BigDecimal getS_0_rate_cst_b() {
        return s_0_rate_cst_b;
    }

    public void setS_0_rate_cst_b(BigDecimal s_0_rate_cst_b) {
        this.s_0_rate_cst_b = s_0_rate_cst_b;
    }

    public BigDecimal getRate_s_8_a() {
        return rate_s_8_a;
    }

    public void setRate_s_8_a(BigDecimal rate_s_8_a) {
        this.rate_s_8_a = rate_s_8_a;
    }

    public BigDecimal getS_tax_due_a() {
        return s_tax_due_a;
    }

    public void setS_tax_due_a(BigDecimal s_tax_due_a) {
        this.s_tax_due_a = s_tax_due_a;
    }

    public BigDecimal getS_tax_due_b() {
        return s_tax_due_b;
    }

    public void setS_tax_due_b(BigDecimal s_tax_due_b) {
        this.s_tax_due_b = s_tax_due_b;
    }

    public BigDecimal getRate_s_9_b() {
        return rate_s_9_b;
    }

    public void setRate_s_9_b(BigDecimal rate_s_9_b) {
        this.rate_s_9_b = rate_s_9_b;
    }

    public BigDecimal getS_4_rate_a() {
        return s_4_rate_a;
    }

    public void setS_4_rate_a(BigDecimal s_4_rate_a) {
        this.s_4_rate_a = s_4_rate_a;
    }

    public BigDecimal getS_4_rate_b() {
        return s_4_rate_b;
    }

    public void setS_4_rate_b(BigDecimal s_4_rate_b) {
        this.s_4_rate_b = s_4_rate_b;
    }

    public BigDecimal getP_4_rate_pr() {
        return p_4_rate_pr;
    }

    public void setP_4_rate_pr(BigDecimal p_4_rate_pr) {
        this.p_4_rate_pr = p_4_rate_pr;
    }

    public BigDecimal getS_12_5_rate_a() {
        return s_12_5_rate_a;
    }

    public void setS_12_5_rate_a(BigDecimal s_12_5_rate_a) {
        this.s_12_5_rate_a = s_12_5_rate_a;
    }

    public BigDecimal getS_12_5_rate_b() {
        return s_12_5_rate_b;
    }

    public void setS_12_5_rate_b(BigDecimal s_12_5_rate_b) {
        this.s_12_5_rate_b = s_12_5_rate_b;
    }

    public BigDecimal getP_12_5_rate() {
        return p_12_5_rate;
    }

    public void setP_12_5_rate(BigDecimal p_12_5_rate) {
        this.p_12_5_rate = p_12_5_rate;
    }

    public BigDecimal getS_1_rate_a() {
        return s_1_rate_a;
    }

    public void setS_1_rate_a(BigDecimal s_1_rate_a) {
        this.s_1_rate_a = s_1_rate_a;
    }

    public BigDecimal getS_1_rate_b() {
        return s_1_rate_b;
    }

    public void setS_1_rate_b(BigDecimal s_1_rate_b) {
        this.s_1_rate_b = s_1_rate_b;
    }

    public BigDecimal getP_1_rate_pr() {
        return p_1_rate_pr;
    }

    public void setP_1_rate_pr(BigDecimal p_1_rate_pr) {
        this.p_1_rate_pr = p_1_rate_pr;
    }

    public BigDecimal getS_1schedule_v_a() {
        return s_1schedule_v_a;
    }

    public void setS_1schedule_v_a(BigDecimal s_1schedule_v_a) {
        this.s_1schedule_v_a = s_1schedule_v_a;
    }

    public BigDecimal getS_1schedule_v_b() {
        return s_1schedule_v_b;
    }

    public void setS_1schedule_v_b(BigDecimal s_1schedule_v_b) {
        this.s_1schedule_v_b = s_1schedule_v_b;
    }

    public BigDecimal getSales_due_rate() {
        return sales_due_rate;
    }

    public void setSales_due_rate(BigDecimal sales_due_rate) {
        this.sales_due_rate = sales_due_rate;
    }

    public BigDecimal getS_2schedule_v_a() {
        return s_2schedule_v_a;
    }

    public void setS_2schedule_v_a(BigDecimal s_2schedule_v_a) {
        this.s_2schedule_v_a = s_2schedule_v_a;
    }

    public BigDecimal getS_2schedule_v_b() {
        return s_2schedule_v_b;
    }

    public void setS_2schedule_v_b(BigDecimal s_2schedule_v_b) {
        this.s_2schedule_v_b = s_2schedule_v_b;
    }

    public BigDecimal getTot_amt_out_tax() {
        return tot_amt_out_tax;
    }

    public void setTot_amt_out_tax(BigDecimal tot_amt_out_tax) {
        this.tot_amt_out_tax = tot_amt_out_tax;
    }
}
