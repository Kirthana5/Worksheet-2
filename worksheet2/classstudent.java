/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.*;
/**
 *
 * @author ELCOT
 */
class student
{
    String name,dept,status;
    int rllno;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name:");
        name=obj.next();
        System.out.println("Enter department:");
        dept=obj.next();
        System.out.println("Enter roll no:");
        rllno=obj.nextInt();
        System.out.println("Enter marks of 3 subjects:");
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
        
    }
    void markcal()
    {
        avg=(m1+m2+m3)/3.0;
        if(m1<50 || m2<50 || m3<50)
           status="Fail!!";
        else
        {
        if(avg>=80)
           status="First class";
        else if(avg>=70 &&avg<=79)
           status="Second class";
        else if(avg>=50 &&avg<=69)
           status="Third class";
        else 
           status="Fail!!";
         }
    }
    void display()
    {
        System.out.println("Name: "+name+"\nDepartment: "+dept+"\nRoll no: "+rllno+"\nMarks1: "+m1+"\nMarks2: "+m2+"\nMarks3: "+m3+"\nAverage: "+avg+"\nStatus: "+status);
    }
}
public class classstudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       student obj[]=new student[10];
       for(int i=0;i<10;i++)
       {
       obj[i]=new student();
       System.out.println("Enter student  "+(i+1)+" details:");
       obj[i].getdata();
       obj[i].markcal();
       }
       for(int i=0;i<10;i++)
       {
           System.out.println("Details of the student: "+(i+1));
           obj[i].display();   
       }

    }
    
}
