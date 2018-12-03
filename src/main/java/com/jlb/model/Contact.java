package com.jlb.model;

public class Contact {
    private String name;
    private String subject;
    private String contactNumber;
    private String email;
    private String message;


    public Contact(){}


    public String getName() {
        return name;
    }
    public String message(){
        return message;
    }
    public void setMessage(){
        this.message = message;
    }
    public String getSubject() {
        return subject;
    }


    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
