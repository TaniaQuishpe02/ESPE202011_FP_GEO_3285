/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperactiones;

/**
 *
 * @author USER
 */
public class BasicOperactiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // variable declaration 
       int sum;
       int addend1; 
       int addend2;
       
       int minuend; 
       int subtrahend;
       int difference;
       
       int multiplication; 
       int factor1;
       int factor2;
       
       int division;
       int divider;
       int dividend;
       
       divider = 12;
       dividend = 2;
       
       // initization 
       factor1 = 3;
       factor2 = 2;
      
       // initization 
       minuend = -23;
       subtrahend = -6;
       
       //-23-(-6) =-23 +6 = 17
       
       // initiization 
       addend1 = 5;
       addend2 = 18;
       
       // operation 
       sum = addend1 + addend2;
       
       System.out.print("the addition of " + addend1 + " + " + addend2 + 
               " is equal to --> " + sum );
       
        System.out.println(" the subtraction of " + minuend + " - " + subtrahend + 
                " is equal to " +( minuend - subtrahend ) );
        
        System.out. println(" the multiplication of " + factor1 + " * " + factor2 + 
                " is equal to " + ( factor1 * factor2 ));
        System.out. println(" the division of " + divider + " ÷ " + dividend +
                " is equal to " + ( divider / dividend ));
       
    } 
       
}
