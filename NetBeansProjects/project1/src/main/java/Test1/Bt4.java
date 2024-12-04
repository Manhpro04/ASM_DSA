/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bt4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh  a:");
        int a = sc.nextInt();
        System.out.println("Nhap vao canh  b:");
        int b =sc.nextInt();
        System.out.println("Nhap vao canh c");
        int c = sc.nextInt();
        if (((c*c)==(a*a)+(b*b))||((c*c)+(a*a)==(b*b))|| ((c*c)+(b*b)==(a*a))){
            System.out.println("Day la tam giac vuong");
        }
        else{
            System.out.println("Day khong phai tam giac vuon");
        }
   
    }
}
