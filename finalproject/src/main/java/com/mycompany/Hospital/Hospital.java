/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Hospital;

import java.util.Scanner;
import java.util.ArrayList;

public class Hospital {

   public static void main(String[] args) throws InvalidAgeException {
        Scanner input=new Scanner(System.in);
        ArrayList<PatientA>listA=new ArrayList<PatientA>();
        ArrayList<PatientB>listB=new ArrayList<PatientB>();
        int exit=0;
        while(exit==0){
        System.out.println("1- Add a patient");
        System.out.println("2- Print all patients information");
        System.out.println("3- Exit the program");
        int x=input.nextInt();
        if(x==1)
        {
                System.out.println("Enter name");
                String n=input.next();
                System.out.println("Enter ID ");              
                String i=input.next();
                 
                System.out.println("Enter age");
                int a=input.nextInt(); 
                System.out.println("Enter address");
                String d=input.next();
                System.out.println("Enter mobile number");
                String b=input.next();
                System.out.println("Enter email");
                String e=input.next();
                System.out.println("Enter type A for high servise B for normal service");
                char t=input.next().charAt(0);
                 if(t=='A')
                 {
                   PatientA p1=new PatientA(i,n,a,d,b, e);
                   listA.add(p1);
                 }
                 else if(t=='B')
                 { 
                     PatientB p2=new PatientB(i,n,a,d,b, e);
                   listB.add(p2);
                 }
            
        }
        else if(x==2)
        { 
            for(int i=0;i<listA.size();i++)
                {
                    System.out.println(listA.get(i).toString());
                }  
            System.out.println("--------------------------");
            for(int i=0;i<listB.size();i++)
                {
                    System.out.println(listB.get(i).toString());
                }  
        }
        else if(x==3)
        {
            System.out.println("good bay .....");
            exit=1;
        }
        else
        {
            System.out.println("error....enter your choise");
        }
    }
    }  
}