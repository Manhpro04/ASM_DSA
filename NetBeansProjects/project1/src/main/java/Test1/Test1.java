/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */  
public class Test1 {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 10 so:");
        String[] m = new String[10];
        int max = 0;
        int[] n = new int[10];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if (n[i]>max){
                max = n[i];
            } 
        }
        sc.nextLine();
        
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextLine();
        }
        
        Arrays.sort(n);
        Arrays.sort(m);
        
        System.out.print("Mang n: ");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Mang m: ");
        for (String str : m) {
            System.out.print(str + " ");
        }
        System.out.println("");
        System.out.println("So lon nhat: "+ max);
    }
}
