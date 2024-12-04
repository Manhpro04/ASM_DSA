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
public class bt8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n(so nho hon 1000)");
        int n = sc.nextInt();

        sc.close();
    
    if(n<1000){
    for (int i = 0; i < n; i++) {
            System.out.println("Phan tu la " + i);
        }
    }

    
        else{
            System.out.println("Nhap so nho hon 1000");
    }
    }
}
