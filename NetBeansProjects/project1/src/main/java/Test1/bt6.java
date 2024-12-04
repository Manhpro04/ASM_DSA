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
public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1;i<=n;i++){
       if (i%2==0){
         sum =sum+i;
       }
        }
        System.out.println("Tong cac so tu 0 den  "+n +"la "+sum);
    }
        
    }


