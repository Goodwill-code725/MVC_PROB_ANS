/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofanumber;
import java.util.Scanner;
/**
 *
 * @author jrmya
 */
public class PowerOfANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A,P,result=1;
        System.out.println("Please enter the base value:");
        Scanner r=new Scanner(System.in);
        
        A=r.nextInt();
        System.out.println("Please enter the exponent value: ");
        
        P=r.nextInt();
        
        for(int i=1;i<=P;i++)
        {
            result=A*result;
        }
        System.out.println("Your Powered Number is:"+result);
    }
    
}
