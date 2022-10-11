/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleprog1;

/**
 *
 * @author jrmya
 */
public class Rectangleprog1 {
int length,width;
public double getarea(){
    //formula: area = length*width
    double s = length*width;
    return s;
}


    public static void main(String[] args) {
       Rectangleprog1 t = new  Rectangleprog1();
       
       t.length=4;
       t.width=5;      
       System.out.println("Area(1) = "+t.getarea());
       
       t.length=5; 
       t.width=8;
       System.out.println("Area(2) =  "+t.getarea());
       
    }
    
}
