/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roster1.java;
import javax.swing.JOptionPane;
import java.io.*;  


/**
 *
 * @author jrmya
 */
public class Roster1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       
         String string1 = "This program asks the user to enter the number "
 + "and names of students in a course.";
 String noOfStudentsString, studentsName;
 int noOfStudents,
 counter = 0;
 noOfStudentsString = JOptionPane.showInputDialog(string1+ "\n\nHow many students are registered for this class?");
noOfStudents = Integer.parseInt(noOfStudentsString);

 PrintWriter outFile = new PrintWriter("Student1.dat");
 while(counter < noOfStudents){
     outFile.println(studentsName =JOptionPane.showInputDialog("Enterthe student's name: "));
counter++;}
 JOptionPane.showMessageDialog(null, "Thank You", "RegisteredStudents", JOptionPane.INFORMATION_MESSAGE);
 outFile.close();
System.exit(0);        }   
    
   
}
