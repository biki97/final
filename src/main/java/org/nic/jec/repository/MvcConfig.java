package org.nic.jec.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/welcome.html").setViewName("welcome");
        registry.addViewController("/form1.html").setViewName("form1");
        registry.addViewController("/form2.html").setViewName("form2");
        registry.addViewController("/form3.html").setViewName("form3");
        registry.addViewController("/form4.html").setViewName("form4");
        registry.addViewController("/form5.html").setViewName("form5");
        registry.addViewController("/dashboard.html").setViewName("dashboard");
    }

}