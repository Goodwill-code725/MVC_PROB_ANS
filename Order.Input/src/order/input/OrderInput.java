/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.input;
import javax.swing.JOptionPane;
/**
 *
 * @author jrmya
 */
public class OrderInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userResponse;
        String order;
        
        userResponse = JOptionPane.showInputDialog("Enter the quantity of your first item:");
        double a = Double.parseDouble(userResponse);
        
        userResponse = JOptionPane.showInputDialog("Enter the the cost of your first item:");
        double b = Double.parseDouble(userResponse);
        
        userResponse = JOptionPane.showInputDialog("Enter the description of your first item:");
        String name = (userResponse); 

        userResponse = JOptionPane.showInputDialog("Enter the quantity of your second item:");
        double c = Double.parseDouble(userResponse);
        
        userResponse = JOptionPane.showInputDialog("Enter the the cost of your second item:");
        double d = Double.parseDouble(userResponse);
        
        order = JOptionPane.showInputDialog("Enter the description of your second item:");
                String Order = (order); 

                String str = String.format("Thank you for your order");
                JOptionPane.showMessageDialog(null, str,"Transaction Done",JOptionPane.INFORMATION_MESSAGE);
                {
                    System.out.println("\nQuantity of the item:"+a+"\nCost of your first item:"+b+"\nName of the item:"+name+"\nQunatity of your second item:"+c+"\nCost of the 2nd item:"+d+"\nEnter 2nd item:"+Order);
                }
    }
    
}
