/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfac1.java;
import java.util.Scanner;


/**
 *
 * @author jrmya
 */
public class CalcFac1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int n,fact=1;
            
     Scanner r = new Scanner(System.in);
     System.out.print("Enter a number: ");
             n = r.nextInt();
                if (n < 0)
                        
                {
                    System.out.printf("Must enter a positive number",n);
                }
                n=r.nextInt ();
                for(int i=1; i<=n; i++)
                {
                fact = fact * i;
                    }
                System.out.println("Factorial Value: "+ fact);
    }
}
