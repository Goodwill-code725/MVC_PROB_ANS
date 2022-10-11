/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4triangle;

 import javax.swing.JOptionPane;
public class JavaApplication4Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double base, height, area;
        String baseStr, heightStr;
        
        baseStr = JOptionPane.showInputDialog("Enter the base of the triangle");
        base = Double.parseDouble(baseStr);
        
        heightStr = JOptionPane.showInputDialog("Enter the height of the triangle");
        height = Double.parseDouble(heightStr);
        {
        area = 0.5*base*height;
        }
        String str = String.format("The Area of the triangle is %.2f cm %n",area);
        
        JOptionPane.showMessageDialog(null, str,"Triangle Calculator",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
    }
    
}
