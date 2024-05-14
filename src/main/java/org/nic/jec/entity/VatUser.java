package org.nic.jec.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
@EntityScan
@ToString
@Data
@Table(name = "login_dealer")//
public class VatUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long vatUserId;

    @Column(name = "vat_rc_no")
    private String tin_number;

    private String vatRc;

    @Column(name = "user_cd")
    private String username;

    @Column(name = "new_hash")
    private String password;


    private Date dob;


    private String salt;


    private Double count;


    private Date log_date;


    private String acc_log;


    private String hash;


    private String email;


    private String mobile;


    private String one_time_otp;


    private Date otp_validity;


    private String usr_cd;

    @Column(name = "passwd")
    private String newHash;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getVatUserId() {
        return vatUserId;
    }

    public void setVatUserId(Long vatUserId) {
        this.vatUserId = vatUserId;
    }


    public String getTin_number() {
        return tin_number;
    }

    public void setTin_number(String tin_number) {
        this.tin_number = tin_number;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Date getLog_date() {
        return log_date;
    }

    public void setLog_date(Date log_date) {
        this.log_date = log_date;
    }

    public String getAcc_log() {
        return acc_log;
    }

    public void setAcc_log(String acc_log) {
        this.acc_log = acc_log;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOne_time_otp() {
        return one_time_otp;
    }

    public void setOne_time_otp(String one_time_otp) {
        this.one_time_otp = one_time_otp;
    }

    public Date getOtp_validity() {
        return otp_validity;
    }

    public void setOtp_validity(Date otp_validity) {
        this.otp_validity = otp_validity;
    }

    public String getUsr_cd() {
        return usr_cd;
    }

    public void setUsr_cd(String usr_cd) {
        this.usr_cd = usr_cd;
    }

    public String getNewHash() {
        return newHash;
    }

    public void setNewHash(String newHash) {
        this.newHash = newHash;
    }

}
