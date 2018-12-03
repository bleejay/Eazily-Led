package com.jlb.model;

import java.time.LocalDate;


public class Project {

    private int id;
    private String title;
    private LocalDate date;
    private int time;
    private String smallDescription;
    private String largeDescription;

    public Project(int id, String title, LocalDate date, int time, String smallDescription, String largeDescription) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
        this.smallDescription = smallDescription;
        this.largeDescription = largeDescription;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }

    public String getLargeDescription() { return largeDescription; }

    public void setLargeDescription(String largeDescription) { this.largeDescription = largeDescription; }
}
