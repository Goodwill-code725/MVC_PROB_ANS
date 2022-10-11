/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delete35;
import java.util.Scanner; 
import java.io.*;
/**
 *
 * @author jrmya
 */
public class Delete35 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
    System.out.println("Enter the number of students: ");
    int N =input.nextInt();
    
    {
        int counter = 0;
        while(counter < N)
        {
        System.out.println("Enter the names of Students: ");
         String Names = input.next();  
         
        try (PrintWriter outFile = new PrintWriter("Student1.dat")) {
            outFile.println("Students names: \n"+Names);
            
        }catch (IOException ex) {
                System.out.printf("ERROR: %s\n", ex);
                                    
        }
               
         {
             counter++;  
         }
           
         
         
        }
        System.out.println("Class Full");
    }   
  
         
         

}
}

