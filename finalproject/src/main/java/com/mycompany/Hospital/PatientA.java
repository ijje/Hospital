/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Hospital;

public class PatientA extends Patient implements Type {

    public PatientA(String ID, String name, int age, String address, String mobileNumber, String email) throws InvalidAgeException {
        super(ID, name, age, address, mobileNumber, email);
    }
  
    public String type()
    {
      return "high service ";
        
    }

    @Override
    public String toString() {
        return super.toString()+" type "+type();
    }
    
}
