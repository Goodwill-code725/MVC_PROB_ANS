/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


import java.util.Scanner;
/**
 *
 * @author jrmya
 */
public class JavaApplication8 {

    
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        
        System.out.println("Enter a Number:");    
        Double number = reader.nextDouble();
        
        
    if (number == 100) {
      System.out.println(number + "The number is positive.");
    }

   
    else if (number == 200) {
      System.out.println(number +"The number is negative.");
    }
    
   
    else {
      System.out.println(number +"Model 300");
      
        }
    }
}
