package org.nic.jec.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "total_output_tax_online")
public class TotalOutputTaxOnline {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    @ManyToOne
    @JoinColumn(name = "return_no", referencedColumnName = "return_no") // Assuming 'return_no' is the column name in both tables
    private MasterReturnOnline masterReturnOnline; // Establishing a Many-to-One relationship with MasterReturnOnline entity

    @Column(name = "sales_cancelled")
    private Double sales_cancelled;

    @Column(name = "returns_of_sold_goods")
    private Double returns_of_sold_goods;

    @Column(name = "oth_adjustment_add")
    private Double oth_adjustment_add;

    @Column(name = "oth_adjustment_sub")
    private Double oth_adjustment_sub;

    @Column(name = "tot_adjustment")
    private Double tot_adjustment;

    @Column(name = "total_output_tax")
    private Double total_output_tax;

    // Constructors, getters, and setters
    public TotalOutputTaxOnline() {
    }

    public TotalOutputTaxOnline(Double salesCancelled, Double returnsOfSoldGoods, Double otherAdjustmentAdd, Double otherAdjustmentSub, Double totalAdjustment, Double totalOutputTax) {
        this.sales_cancelled = salesCancelled;
        this.returns_of_sold_goods = returnsOfSoldGoods;
        this.oth_adjustment_add = otherAdjustmentAdd;
        this.oth_adjustment_sub = otherAdjustmentSub;
        this.tot_adjustment = totalAdjustment;
        this.total_output_tax = totalOutputTax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MasterReturnOnline getMasterReturnOnline() {
        return masterReturnOnline;
    }

    public void setMasterReturnOnline(MasterReturnOnline masterReturnOnline) {
        this.masterReturnOnline = masterReturnOnline;
    }

    public Double getSales_cancelled() {
        return sales_cancelled;
    }

    public void setSales_cancelled(Double sales_cancelled) {
        this.sales_cancelled = sales_cancelled;
    }

    public Double getReturns_of_sold_goods() {
        return returns_of_sold_goods;
    }

    public void setReturns_of_sold_goods(Double returns_of_sold_goods) {
        this.returns_of_sold_goods = returns_of_sold_goods;
    }

    public Double getOth_adjustment_add() {
        return oth_adjustment_add;
    }

    public void setOth_adjustment_add(Double oth_adjustment_add) {
        this.oth_adjustment_add = oth_adjustment_add;
    }

    public Double getOth_adjustment_sub() {
        return oth_adjustment_sub;
    }

    public void setOth_adjustment_sub(Double oth_adjustment_sub) {
        this.oth_adjustment_sub = oth_adjustment_sub;
    }

    public Double getTot_adjustment() {
        return tot_adjustment;
    }

    public void setTot_adjustment(Double tot_adjustment) {
        this.tot_adjustment = tot_adjustment;
    }

    public Double getTotal_output_tax() {
        return total_output_tax;
    }

    public void setTotal_output_tax(Double total_output_tax) {
        this.total_output_tax = total_output_tax;
    }

    @Override
    public String toString() {
        return "TotalOutputTaxOnline{" +
                "salesCancelled=" + sales_cancelled +
                ", returnsOfSoldGoods=" + returns_of_sold_goods +
                ", otherAdjustmentAdd=" + oth_adjustment_add +
                ", otherAdjustmentSub=" + oth_adjustment_sub +
                ", totalAdjustment=" + tot_adjustment +
                ", totalOutputTax=" + total_output_tax +
                '}';
    }
}
