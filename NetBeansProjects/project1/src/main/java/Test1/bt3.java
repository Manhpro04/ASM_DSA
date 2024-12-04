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
public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap canh a:");
        int a = sc.nextInt();
        System.out.println("Nhap canh b :");
        int b = sc.nextInt();
        
         System.out.println("Nhap canh c :");
        int c =sc.nextInt();
        if( a+b> c && a+c> b && b+c >a){
            System.out.println("Day la ba canh cua tam giac");
            
        }
        else{
            System.out.println("Day khong phai ba canh cua tam giac");
        }
        
        
        
        sc.close();
    }
}
