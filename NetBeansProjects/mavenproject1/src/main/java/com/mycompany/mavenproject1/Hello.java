/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *///     
//        Scanner ac = new Scanner(System.in);
////        System.out.print("Enter your name: ");
////        String name = ac.nextLine();    
////        System.out.println("Hello, " + name + "!");
////        
//     String brand
//       System.out.print("Enter the length of the rectangle: ");
//        double length = ac.nextDouble();
//
//        System.out.print("Enter the width of the rectangle: ");
//        double width = ac.nextDouble();
//
//        double perimeter = 2 * (length + width);
//        double area = length * width;
//
//        System.out.println("\nRectangle Properties:");
//        System.out.println("Length: " + length);
//        System.out.println("Width: " + width);
//        System.out.println("Perimeter: " + perimeter);
//        System.out.println("Area: " + area);
package com.mycompany.mavenproject1;

//import java.util.Scanner;

public class Hello {
    String name; 
    int age; 

    public void printName() { 
        System.out.println("Name: " + name); 
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Hello std = new Hello();  
        std.name = "John";       
        std.age = 20;             
        std.printName();         
        std.printAge();   
        Hello std2 =new Hello();
        std.name = "Steve";       
        std.age = 16;             
        std.printName();         
        std.printAge();  
        
    }
    
}

