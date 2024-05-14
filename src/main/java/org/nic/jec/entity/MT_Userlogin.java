package org.nic.jec.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "mt_userlogin")
@NoArgsConstructor
@AllArgsConstructor
public class MT_Userlogin {

    @Id
    private String userid;
    private String username;
    private String password;

    @OneToOne
    @JoinColumn(name = "role_code")
    private M_userroles role_code;


    @Transient
    private String captcha;

    @Transient
    private String hiddenCaptcha;

    @Transient
    private String realCaptcha;

}
