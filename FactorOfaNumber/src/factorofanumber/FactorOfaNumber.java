/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorofanumber;
import java.util.Scanner;
/**
 *
 * @author jrmya
 */
public class FactorOfaNumber {
public int factorial(int n){
    switch (n) {
        case 1:
            return 1;
        case 0:
            return 0;
        default:
            return n * factorial (n - 1);
    }

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //sample result: !5 = 120
    FactorOfaNumber t = new FactorOfaNumber();
    Scanner s = new Scanner(System.in);
    System.out.println("Your number is: ");
        System.out.println("The Factorial Value is: "+t.factorial(s.nextInt()));
        

    }
    
}
