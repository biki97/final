package org.nic.jec.entity;


import jakarta.persistence.*;

@Table(name = "master_return_online" )
@Entity
public class MasterReturnOnline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "return_no", unique = true) // Assuming 'return_no' is the column name
    private String returnNo; // Add the return number field
    private String fromMonth;
    private int fromYear;
    private String toMonth;
    private int toYear;

    public MasterReturnOnline() {
        // Default constructor
    }

    public MasterReturnOnline(String returnNo, String fromMonth, int fromYear, String toMonth, int toYear) {
        this.returnNo = returnNo;
        this.fromMonth = fromMonth;
        this.fromYear = fromYear;
        this.toMonth = toMonth;
        this.toYear = toYear;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    public String getFromMonth() {
        return fromMonth;
    }

    public void setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
    }

    public int getFromYear() {
        return fromYear;
    }

    public void setFromYear(int fromYear) {
        this.fromYear = fromYear;
    }

    public String getToMonth() {
        return toMonth;
    }

    public void setToMonth(String toMonth) {
        this.toMonth = toMonth;
    }

    public int getToYear() {
        return toYear;
    }

    public void setToYear(int toYear) {
        this.toYear = toYear;
    }

    @Override
    public String toString() {
        return "MasterReturnOnline{" +
                "id=" + id +
                ", returnNo='" + returnNo + '\'' +
                ", fromMonth='" + fromMonth + '\'' +
                ", fromYear=" + fromYear +
                ", toMonth='" + toMonth + '\'' +
                ", toYear=" + toYear +
                '}';
    }
}
