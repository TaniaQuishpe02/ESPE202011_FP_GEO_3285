/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.functions.recurcion;

/**
 *
 * @author USER
 */
public class WS11FunctionsRecurcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 5;
        int fact = 0;
        fact = Factorial(number);
        System.out.println("Factorial of:" + number +"is equal to -->" + fact);
    }
    
    public static int Factorial (int n) {
        if (n < 0) {
            return -1 ;
        } else {
            if (n==0) {
                return 1;
            }
        } 
        /* return ( n * factorial(n - 1));*/
        return (n * Factorial (n - 1) );
        }
    }

   
    


    

    

   

