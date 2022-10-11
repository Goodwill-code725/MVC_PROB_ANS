/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif;
/**
 *
 * @author jrmya
 */
public class Elseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int lowerLimit = 50;
int divisor = 0;
int result;
try
{
    System.out.println("Entering the try block.");
    
    result = lowerLimit/divisor;
    
    if(lowerLimit < 100)
        throw new Exception("Lower limit violation.");
    
    System.out.println("Exiting the try block.");
}
catch(ArithmeticException e )
{
    System.out.println("Exception:" +e.getMessage());
    result = 110;
}
catch(Exception e )
{
    System.out.println("Exception:"+e.getMessage());
}
{
System.out.println("After the catch block");
}
    }
    
}

