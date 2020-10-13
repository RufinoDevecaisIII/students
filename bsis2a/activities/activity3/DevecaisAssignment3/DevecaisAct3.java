/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devecaisact3;


import java.util.Scanner;

public class DevecaisAct3 {

    static Scanner temperature = new Scanner(System.in);
    
    public static void main(String[] args) {
        double celcious;
        double farenheit;
        
        System.out.println("Celius to Farenheit converter \n");
         
        System.out.print("Please enter your temperature: ");
        celcious = temperature.nextDouble();
        
        farenheit = (celcious * 9 / 5) + 32;
        
        System.out.println("\nYour farenheit is: "+ farenheit);
    }
    
}
