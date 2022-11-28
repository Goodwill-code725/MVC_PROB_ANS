/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortinganarray;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author jrmya
 */
public class SortingAnArray {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        //size of the array
        int a[];
        int temp;
        System.out.println("Enter 5 random numbers");
        a = new int [5];
        for (int i=0;i<a.length;i++)
            {
            System.out.println("\nEnter value " + (i + 1));
            a[i] = s.nextInt();
            }
        System.out.println("Entered Numbers: "+Arrays.toString(a));
        // sort numbers
        {
        for (int i=0;i<a.length;i++)
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }        
        } 
        System.out.println("Ascending Order: "+Arrays.toString(a));
    }
}
    

