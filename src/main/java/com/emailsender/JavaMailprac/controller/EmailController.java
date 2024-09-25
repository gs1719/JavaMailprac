package com.emailsender.JavaMailprac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    JavaMailSender javaMailSender;


    @GetMapping("/sendEmail")
    public void sendEmail(){
        SimpleMailMessage m = new SimpleMailMessage();
        m.setTo("gauravsriup@gmail.com");
        m.setFrom("gauravsriup@gmail.com");
        m.setSubject("SpringBoot java mail sender");
        m.setText("Checking the java mail sender");
        javaMailSender.send(m);
    }
}
