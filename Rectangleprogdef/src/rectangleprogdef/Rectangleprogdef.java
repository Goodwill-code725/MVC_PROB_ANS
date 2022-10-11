/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleprogdef;
import java.util.Scanner;
/**
 *
 * @author jrmya
 */
public class Rectangleprogdef {
int length,width;
public double getarea(){
    //formula: area = length*width
    double s = length*width;
    return s;
  
}
public double getperimeter (){
return 2*(length+width);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Rectangleprogdef t = new  Rectangleprogdef();
         
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter a number for square 1(value 1)");
       t.length = scan.nextInt();
       System.out.println("Enter a number for square 1(value 2)");
       t.width = scan.nextInt();                   
       System.out.println("\n\nResult:");
       System.out.println("Square 1 = "+t.getarea());
              System.out.println("Square 1 perimeter = "+t.getperimeter());

         //rectangle #2
        System.out.println("\n************************************************");
        
       System.out.println("\nEnter a number for square 2 (value 1)");
       t.length = scan.nextInt();
       System.out.println("Enter a number for square 2(value 2)");
       t.width = scan.nextInt();     
        System.out.println("\n\nResult:");
       System.out.println("Square 2 = "+t.getarea());
       System.out.println("Square 2 perimeter = "+t.getperimeter());
    }
    
}
