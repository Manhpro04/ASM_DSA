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
public class Bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Nhap vao 1 so ");
     int number = sc.nextInt();
     String word = convertToWords(number);
        System.out.println("So ban nhap la :"+ word);
        sc.close();
    }
    public static String convertToWords(int number){
    switch (number){
        case 1 :return "Mot";
       case 2 :return "Hai";
        case 3 :return "Ba";
        case 4 :return "Bon";
        case 5 :return "Nam";
        case 6 :return "Sau";
        case 7 :return "Bay";
        case 8 :return "Tam";
        case 9 :return "Chin";
        case 10 :return "Muoi";
        default :return "So ko nam trong khoang 1 den 10";
        
              
    }
    }
}
