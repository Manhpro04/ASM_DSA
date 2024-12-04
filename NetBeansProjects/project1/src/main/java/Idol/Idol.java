/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Idol;

/**
 *
 * @author ADMIN
 */
public class Idol {
    String Name ;
    int Vong1;
    int Chieucao;
    public void work() {
    System.out.println("The idol is working");    
}
    public void eat(){
   System.out.println("the idol is eating");
}
    public static void main(String[] args) {
        Idol EmiFucada =new Idol();
        EmiFucada.Name = "Emifucada ";
        EmiFucada.Vong1= 60 ;
        EmiFucada.Chieucao = 175;
        EmiFucada.work();
        EmiFucada.eat();
        System.out.println("the Idol is " +EmiFucada.Name);
        System.out.println("the Idol is " +EmiFucada.Vong1);
        System.out.println("the Idol is " +EmiFucada.Chieucao);

    }

}
