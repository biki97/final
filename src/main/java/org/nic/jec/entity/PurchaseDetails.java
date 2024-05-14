package org.nic.jec.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "total_input_tax_credit_online")
public class PurchaseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "return_no", referencedColumnName = "return_no") // Assuming 'return_no' is the column name in both tables
    private MasterReturnOnline masterReturnOnline; // Establishing a Many-to-One relationship with MasterReturnOnline entity
    private int stockOnTransition;
    private int itcCarriedForward;
    private int itcCapitalGoods;
    private int itcDebitNote;
    private int othAdjustmentAdd;
    private int totalItc;
    private int itcCreditNote;
    private int taxCreditReversed;
    private int othAdjustmentSub;
    private int totItcDeduct;
    private int totNetItc;
    private int taxPayable;
    private int interestPenaltyDues;
    private int totalDues;
    private int taxDeductedAtSource;
    private int balanceExcess;
    private int taxPaid;
    private int balanceDue;
    private int cstAdjustLiability;
    private int refund;
    private int balanceCarriedForward;
    private int totalNoOfReturnsSubmittedByDealer;

    public PurchaseDetails() {

    }

    // Constructors, getters, and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStockOnTransition() {
        return stockOnTransition;
    }

    public void setStockOnTransition(int stockOnTransition) {
        this.stockOnTransition = stockOnTransition;
    }

    public int getItcCarriedForward() {
        return itcCarriedForward;
    }

    public void setItcCarriedForward(int itcCarriedForward) {
        this.itcCarriedForward = itcCarriedForward;
    }

    public int getItcCapitalGoods() {
        return itcCapitalGoods;
    }

    public void setItcCapitalGoods(int itcCapitalGoods) {
        this.itcCapitalGoods = itcCapitalGoods;
    }

    public int getItcDebitNote() {
        return itcDebitNote;
    }

    public void setItcDebitNote(int itcDebitNote) {
        this.itcDebitNote = itcDebitNote;
    }

    public int getOthAdjustmentAdd() {
        return othAdjustmentAdd;
    }

    public void setOthAdjustmentAdd(int othAdjustmentAdd) {
        this.othAdjustmentAdd = othAdjustmentAdd;
    }

    public int getTotalItc() {
        return totalItc;
    }

    public void setTotalItc(int totalItc) {
        this.totalItc = totalItc;
    }

    public int getItcCreditNote() {
        return itcCreditNote;
    }

    public void setItcCreditNote(int itcCreditNote) {
        this.itcCreditNote = itcCreditNote;
    }

    public int getTaxCreditReversed() {
        return taxCreditReversed;
    }

    public void setTaxCreditReversed(int taxCreditReversed) {
        this.taxCreditReversed = taxCreditReversed;
    }

    public int getOthAdjustmentSub() {
        return othAdjustmentSub;
    }

    public void setOthAdjustmentSub(int othAdjustmentSub) {
        this.othAdjustmentSub = othAdjustmentSub;
    }

    public int getTotItcDeduct() {
        return totItcDeduct;
    }

    public void setTotItcDeduct(int totItcDeduct) {
        this.totItcDeduct = totItcDeduct;
    }

    public int getTotNetItc() {
        return totNetItc;
    }

    public void setTotNetItc(int totNetItc) {
        this.totNetItc = totNetItc;
    }

    public int getTaxPayable() {
        return taxPayable;
    }

    public void setTaxPayable(int taxPayable) {
        this.taxPayable = taxPayable;
    }

    public int getInterestPenaltyDues() {
        return interestPenaltyDues;
    }

    public void setInterestPenaltyDues(int interestPenaltyDues) {
        this.interestPenaltyDues = interestPenaltyDues;
    }

    public int getTotalDues() {
        return totalDues;
    }

    public void setTotalDues(int totalDues) {
        this.totalDues = totalDues;
    }

    public int getTaxDeductedAtSource() {
        return taxDeductedAtSource;
    }

    public void setTaxDeductedAtSource(int taxDeductedAtSource) {
        this.taxDeductedAtSource = taxDeductedAtSource;
    }

    public int getBalanceExcess() {
        return balanceExcess;
    }

    public void setBalanceExcess(int balanceExcess) {
        this.balanceExcess = balanceExcess;
    }

    public int getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(int taxPaid) {
        this.taxPaid = taxPaid;
    }

    public int getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(int balanceDue) {
        this.balanceDue = balanceDue;
    }

    public int getCstAdjustLiability() {
        return cstAdjustLiability;
    }

    public void setCstAdjustLiability(int cstAdjustLiability) {
        this.cstAdjustLiability = cstAdjustLiability;
    }

    public int getRefund() {
        return refund;
    }

    public void setRefund(int refund) {
        this.refund = refund;
    }

    public int getBalanceCarriedForward() {
        return balanceCarriedForward;
    }

    public void setBalanceCarriedForward(int balanceCarriedForward) {
        this.balanceCarriedForward = balanceCarriedForward;
    }

    public int getTotalNoOfReturnsSubmittedByDealer() {
        return totalNoOfReturnsSubmittedByDealer;
    }

    public void setTotalNoOfReturnsSubmittedByDealer(int totalNoOfReturnsSubmittedByDealer) {
        this.totalNoOfReturnsSubmittedByDealer = totalNoOfReturnsSubmittedByDealer;
    }

    public PurchaseDetails(int stockOnTransition, int itcCarriedForward, int itcCapitalGoods, int itcDebitNote, int othAdjustmentAdd, int totalItc, int itcCreditNote, int taxCreditReversed, int othAdjustmentSub, int totItcDeduct, int totNetItc, int taxPayable, int interestPenaltyDues, int totalDues, int taxDeductedAtSource, int balanceExcess, int taxPaid, int balanceDue, int cstAdjustLiability, int refund, int balanceCarriedForward, int totalNoOfReturnsSubmittedByDealer) {
        this.stockOnTransition = stockOnTransition;
        this.itcCarriedForward = itcCarriedForward;
        this.itcCapitalGoods = itcCapitalGoods;
        this.itcDebitNote = itcDebitNote;
        this.othAdjustmentAdd = othAdjustmentAdd;
        this.totalItc = totalItc;
        this.itcCreditNote = itcCreditNote;
        this.taxCreditReversed = taxCreditReversed;
        this.othAdjustmentSub = othAdjustmentSub;
        this.totItcDeduct = totItcDeduct;
        this.totNetItc = totNetItc;
        this.taxPayable = taxPayable;
        this.interestPenaltyDues = interestPenaltyDues;
        this.totalDues = totalDues;
        this.taxDeductedAtSource = taxDeductedAtSource;
        this.balanceExcess = balanceExcess;
        this.taxPaid = taxPaid;
        this.balanceDue = balanceDue;
        this.cstAdjustLiability = cstAdjustLiability;
        this.refund = refund;
        this.balanceCarriedForward = balanceCarriedForward;
        this.totalNoOfReturnsSubmittedByDealer = totalNoOfReturnsSubmittedByDealer;
    }

    public void save(PurchaseDetails totalPurchaseDetails) {
    }
}
