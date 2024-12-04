/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class bt5 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap vao ma so sv");
          String studentID = sc.nextLine();
          String regex="^B[0-9]{7}$";
          if(Pattern.matches(regex, studentID)){
        System.out.println("Mã số sinh viên hợp lệ.");
        } else {
            System.out.println("Mã số sinh viên không hợp lệ.");
        }
        
        sc.close(); 
    }
}
