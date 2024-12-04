/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author ADMIN
 */
public class bt9 {
    public static void main(String[] args) {
//         int [] numbers  = {50,55,60,65,70};
//        System.out.println("New array Element");
//       
//        for (int i = 0; i<numbers.length;i++){
//            System.out.println(numbers[i]);
        
        
        
        
      
        int[] numbers = {5, 10, 20, 15, 25};
        
        
        System.out.println("Original array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
       
        numbers[2] = 30;

        
        System.out.println("\nModified array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
