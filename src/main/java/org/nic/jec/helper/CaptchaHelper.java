package org.nic.jec.helper;

import cn.apiclub.captcha.Captcha;
import org.nic.jec.config.CaptchaUtil;
import org.nic.jec.entity.MT_Userlogin;


public class CaptchaHelper {
    
    public static void getCaptcha(MT_Userlogin userlogin) {
      try {
          Captcha captcha = CaptchaUtil.createCaptcha(300, 75);
          userlogin.setHiddenCaptcha(captcha.getAnswer());
          userlogin.setCaptcha(""); // value entered by the User
          userlogin.setRealCaptcha(CaptchaUtil.encodeCaptcha(captcha));
      } catch (Exception e) {
          throw new RuntimeException("Captcha cannot be generated!");
      }

  }
}
