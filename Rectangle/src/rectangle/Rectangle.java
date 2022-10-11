/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;
import javax.swing.*;
import java.awt.*;
public class Rectangle {
    
    public static void main(String[] args) {
        
    JFrame frame = new JFrame("Rectangle Calculator");
    frame.setLayout( new BorderLayout() );

  	frame.setSize(300, 300); //what is the default size?
  	frame.setVisible(true);
  	frame.setDefaultCloseOperation(3); //Huh?? Why the 3?
        frame.setLayout( new GridLayout(5, 2) );

        
    JLabel lengthL, widthL, areaL, perimeterL;
  lengthL = new JLabel("Enter the length: ",SwingConstants.RIGHT);
  widthL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
  areaL = new JLabel("The area is: ", SwingConstants.RIGHT);
  perimeterL = new JLabel("Perimeter: ", SwingConstants.RIGHT);

  frame.add(lengthL);
  frame.add(widthL);
  frame.add(areaL);
  frame.add(perimeterL);
JTextField lengthTF, widthTF, areaTF, perimeterTF;
  
lengthTF = new JTextField(10);
  widthTF = new JTextField(10);
  areaTF = new JTextField(10);
  perimeterTF = new JTextField(10);

  frame.add(lengthL);
  frame.add(lengthTF);
  frame.add(widthL);
  frame.add(widthTF);
  frame.add(areaL);
  frame.add(areaTF);
  frame.add(perimeterL);
  frame.add(perimeterTF);

    JButton calculateB, exitB;
  calculateB = new JButton("Calculate");
  exitB = new JButton("Exit");

   frame.add(lengthL);
  frame.add(lengthTF);
  frame.add(widthL);
  frame.add(widthTF);
  frame.add(areaL);
  frame.add(areaTF);
  frame.add(perimeterL);
  frame.add(perimeterTF);
  frame.add(calculateB);
  frame.add(exitB);
   
    }
    
}
