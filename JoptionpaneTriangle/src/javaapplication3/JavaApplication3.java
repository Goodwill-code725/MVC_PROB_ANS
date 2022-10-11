/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.JOptionPane;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String input = JOptionPane.showInputDialog("Enter the first value to calculate the area of a triangle: ");
 int n1 = Integer.parseInt(input); //not inputStr <----------
 String inp = JOptionPane.showInputDialog("Enter the second value to calculate the area of a triangle: ");
 int n2 = Integer.parseInt(inp);//not inputStr <---------
 areaTriangle(n1, n2);  // TODO code application logic here
    }

    private static void areaTriangle(int n1, int n2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
