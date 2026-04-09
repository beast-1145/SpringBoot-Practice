package com.beast.practice.model;

public class User {
    private String name;
    private int age;
    private int mobileNumber;
    private String country;

    public User (){};

    public User(String name , int age , int mobNum , String country){
        this.name = name;
        this.age = age;
        this.mobileNumber = mobNum;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMobileNumber(int mobNum){
        this.mobileNumber = mobNum;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
