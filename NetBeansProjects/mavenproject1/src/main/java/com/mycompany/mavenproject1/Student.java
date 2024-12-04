/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;  // Nhập thư viện Scanner

public class Student {

    String name; 
    int age; 

    // Phương thức in tên
    public void printName() { 
        System.out.println("Name: " + name); 
    }

    // Phương thức in tuổi
    public void printAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        Student std1 = new Student();
        System.out.print("Enter name of student 1: ");
        std1.name = scanner.nextLine();
        System.out.print("Enter age of student 1: ");
        std1.age = scanner.nextInt();  
        scanner.nextLine();  
        
        std1.printName();
        std1.printAge();

        
        Student std2 = new Student();
        System.out.print("Enter name of student 2: ");
        std2.name = scanner.nextLine();  
        System.out.print("Enter age of student 2: ");
        std2.age = scanner.nextInt();    

        
        std2.printName();
        std2.printAge();
        
        
        scanner.close();
    }
}


