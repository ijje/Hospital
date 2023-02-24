/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Hospital;

public class Patient {
    
    private String ID;
    private String name;
    private int age;
    private String address;
    private String mobileNumber;
    private String email;

    public Patient(String ID, String name, int age, String address, String mobileNumber, String email) throws InvalidAgeException {
        this.ID = ID;
        this.name = name;
        if(age>=18)
            this.age=age;
        else
            throw new InvalidAgeException("Age should be greater than or equal to 18 years old!");
            
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\nID=" + ID + "\nname=" + name + "\nage=" + age + "\naddress=" + address + "\nmobileNumber=" + mobileNumber + "\nemail=" + email ;
    }
     
}