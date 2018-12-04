package com.jlb.model;

public class Contact {
    private String name;
    private String subject;
    private String contactNumber;
    private String email;
    private String message;

    public Contact(String name, String subject, String contactNumber, String email, String message) {
        this.name = name;
        this.subject = subject;
        this.contactNumber = contactNumber;
        this.email = email;
        this.message = message;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
