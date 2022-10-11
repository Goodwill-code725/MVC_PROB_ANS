
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv.model.java;
import javax.swing.JOptionPane;
/**
 *
 * @author jrmya
 */
public class TvModelJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("This program asks the user to enter a television model number.\n"
                + "The description of the model chosen will be displayed.\n"
                + "Model 100 comes with remote control, timer and stereo sound and costs $1000.\n"
                + "Model 200 comes with all features of model 100, plus picture-in-picture; it costs $1200\n"
                + "Model 300 comes with all features of model 200 plus HDTV, flat screen, and 16 x 9 aspect ratio; it costs $2400.\n\n\n"
                + "Please enter the model number of your chosen Television Model\n");
		int age = Integer.parseInt(input);
		if (age == 100) {
			JOptionPane.showMessageDialog(null, "Thank you for ordering Model l00:\n"
                                + "comes with remote control, timer and stereo sound and costs $1000");
    }
                    if (age == 200)
                                 JOptionPane.showMessageDialog(null, "Thank you for ordering Model 200: \n"
                                + "comes with all features of model 100, plus picture-in-picture; it costs $1200");
                
                        if (age == 300)
                                         JOptionPane.showMessageDialog(null, "Thank you for ordering Model 300: \n"
                                + "Model 300 comes with all features of model 200 plus HDTV, flat screen, and 16 x 9 aspect ratio; it costs $2400.");
                           
                        
                
                      
                


           

                     

    }
    

    }
