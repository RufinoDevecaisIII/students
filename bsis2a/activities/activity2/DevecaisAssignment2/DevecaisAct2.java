/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DevecaisAct2;

import java.util.Scanner;
        
public class DevecaisAct2{

    static Scanner num = new Scanner (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        
        System.out.println("Please input two numbers and discover the sum, difference, product, and quotient. ");
        System.out.print("Please enter your first number: ");
        num1 = num.nextInt();
        System.out.print("Please enter your second number: ");
        num2 = num.nextInt();
        
        int sum = num1 +num2;
        int diff = num1 - num2;
        int pro = num1 * num2;
        int quo = num1 / num2;
     
        
        
        System.out.println("Addition: " + num1 + "+" + num2 +" = " +sum);
        System.out.println("Subtraction :" + num1 + "-" + num2 + " = " + diff);
        System.out.println("Multiplication: " + num1 + " * " + num2  +" = " + pro);
        System.out.println("Division: " + num1 + " / " + num2 +" = " + quo);
        System.out.println("Exponent value:" + num1 + " ^ " + num2 +" = "+ (int) Math.pow(num1,num2));
        
        
    }
    
}
