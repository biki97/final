package org.nic.jec.entity;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.Date;

@ToString
@Entity
@Table(name = "reg_online_login", schema = "vatreturn")
public class RegOnlineLogin {

    @Id
    @Column(name = "user_cd", nullable = false, length = 25)
    private String userCd;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "role_cd", length = 3)
    private String roleCd;

    @Column(name = "log_dt")
    @Temporal(TemporalType.DATE)
    private Date logDt;

    @Column(name = "circle_cd", length = 2)
    private String circleCd;

    @Column(name = "acc_log", length = 3)
    private String accLog = "YES";

    @Column(name = "count")
    private int count = 0;

    @Column(name = "user_name", length = 100)
    private String userName;

    @Column(name = "acc_status", length = 3)
    private String accStatus = "Y";

    @Column(name = "entry_dt")
    @Temporal(TemporalType.DATE)
    private Date entryDt;

    @Column(name = "new_pass", length = 100)
    private String newPass;

    // Getters and Setters

    public RegOnlineLogin(String userCd, String password, String roleCd, Date logDt, String circleCd, String accLog, int count, String userName, String accStatus, Date entryDt, String newPass) {
        this.userCd = userCd;
        this.password = password;
        this.roleCd = roleCd;
        this.logDt = logDt;
        this.circleCd = circleCd;
        this.accLog = accLog;
        this.count = count;
        this.userName = userName;
        this.accStatus = accStatus;
        this.entryDt = entryDt;
        this.newPass = newPass;
    }

    public RegOnlineLogin() {

    }

    public String getUserCd() {
        return userCd;
    }

    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    public Date getLogDt() {
        return logDt;
    }

    public void setLogDt(Date logDt) {
        this.logDt = logDt;
    }

    public String getCircleCd() {
        return circleCd;
    }

    public void setCircleCd(String circleCd) {
        this.circleCd = circleCd;
    }

    public String getAccLog() {
        return accLog;
    }

    public void setAccLog(String accLog) {
        this.accLog = accLog;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public Date getEntryDt() {
        return entryDt;
    }

    public void setEntryDt(Date entryDt) {
        this.entryDt = entryDt;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }
}

