/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1.newpackage;

import java.util.Stack;



/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
//bai 1
    Stack<Integer> stack = new Stack<>();
        System.out.println("Stack is Empty on initialization "+stack.isEmpty());
        stack.push(20);
        stack.push(13);
        stack.push(89);
        stack.push(90);
        stack.push(11);
        stack.push(45);
        stack.push(18);
       
        System.out.println("Element Stack "+stack);
      
        System.out.println("Stack is empty after push "+stack.isEmpty());
        for(int i = 0; i<3;i++){
            int removedElement = stack.pop();
    System.out.println("Element is removed from the stack: " + removedElement);
        }
System.out.println("Stack sau khi xóa 3 phần tử: " + stack);
   
       
       
  
        int elementToChange = 90;
        int newValue = 100;
        
        
        Stack<Integer> tempStack = new Stack<>();
        
       
        for (int element : stack) {
            if (element == elementToChange) {
                tempStack.push(newValue); 
            } else {
                tempStack.push(element); 
            }
        }
        
        
        stack.clear(); 
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop()); 
        }
        
        
        System.out.println("Stack sau khi thay đổi giá trị: " + stack);
    }
}
