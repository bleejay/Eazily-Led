package com.jlb.model;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class SimpleEmailSender{

    private MailSender mailSender;

    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(String subject, String name, String email, String contactNumber, String message){

        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo("eazily.l3d@gmail.com");
        msg.setSubject(subject);
        msg.setText("Contact request from: " + name + "\n\nContact Details: " + email + " (" + contactNumber + ")" + "\n\n" + message);
        this.mailSender.send(msg);
    }

}
