package com.sematec.java.lib;

public class TestTeacherModel {
    private int age;
    private String name;
    private long tCode;
    private String fatherName;
    private String nCode;
    private String phoneNumber;

    public TestTeacherModel(int age, String name, long tCode, String fatherName, String nCode, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.tCode = tCode;
        this.fatherName = fatherName;
        this.nCode = nCode;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long gettCode() {
        return tCode;
    }

    public void settCode(long tCode) {
        this.tCode = tCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getnCode() {
        return nCode;
    }

    public void setnCode(String nCode) {
        this.nCode = nCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
