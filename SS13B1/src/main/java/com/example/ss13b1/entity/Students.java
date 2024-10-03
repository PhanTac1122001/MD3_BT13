package com.example.ss13b1.entity;

import java.util.Date;

public class Students {
    private Integer studentId;
    private String fullName;
    private boolean gender;
    private Date birthDay;
    private String address;
    private Classes classes;

    public Students() {
    }

    public Students(Integer studentId, String fullName, boolean gender, Date birthDay, String address, Classes classes) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
        this.classes = classes;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
