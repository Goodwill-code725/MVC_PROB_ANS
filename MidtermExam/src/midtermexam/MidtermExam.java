/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam;
import java.util.Scanner;
/**
 *
 * @author jrmya
 */
public class MidtermExam {
    public static void valueidentifier(int a[]){
    
        int positive = 0;
        int negative = 0;
        int numzero = 0;
        int odd = 0;
        int even = 0;
        
        for (int i = 0; i<a.length;i++)
        {
            if (a[i] > 00)
                positive = positive + 1;
            else if (a[i]<=0)
                negative = negative + 1;
            if(a[i] == 0)
                    numzero = numzero + 1;
            if (a[i]%2!=0)
                    odd = odd+1;
            if (a[i]%2==0)
                    even = even+1;
        }
        System.out.println("Positive numbers: " +""+positive);
        System.out.println("Negative numbers: " +"" +negative);
        System.out.println("numbers of (0): " + numzero);
        System.out.println("Odd numbers " + odd);
        System.out.println("Even numbers " + even);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int a[];
      System.out.print("Enter the size of the array: \n");
       int n = s.nextInt();
        a = new int [n];
            for (int i=0;i<a.length;i++)
            {
            System.out.println("Enter value: " + (i + 1));
            a[i] = s.nextInt();
            }
           
            valueidentifier(a);
           
          }
        
    
}
