/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

import java.util.Scanner;

/**
 *
 * @author jrmya
 */
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        double grade1,grade2,grade3, average;
        
        System.out.println("Enter 3 Grades:");
        
        grade1 = console.nextDouble();
        grade2 = console.nextDouble();
        grade3 = console.nextDouble();
        
        average= (grade1+grade2+grade3)/3;
      
        System.out.println("Your Grade Is:"+ average);
    }
    
}
