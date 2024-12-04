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
public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        
        sc.close();
        int result =0;
        for (int i=1; i<=20;i++){
          result =n*i  ;
          System.out.println(n + " x " + i + " = " + result); // In kết quả
        }
        
    }
}
