/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realtor;
import javax.swing.JOptionPane;
/**
 *
 * @author jrmya
 */
public class Realtor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userResponse;
        userResponse = JOptionPane.showInputDialog("Enter your home owner's last name:");
        String name = userResponse; 
        
        userResponse = JOptionPane.showInputDialog("Enter the selling price:");
        double a = Double.parseDouble(userResponse);
        
        userResponse = JOptionPane.showInputDialog("Enter the cost of selling the house:");
        double b = Double.parseDouble(userResponse);
        
        Double com = (a-b)*0.10;
        
        
         String str = String.format("The "+name+" sold for: "+a+"\n The Cost to sell the home was: "+b+"\nThe selling or listing agent earned: "+com);
        
        JOptionPane.showMessageDialog(null, str,"Comission",JOptionPane.INFORMATION_MESSAGE);
            
    }
    
}
