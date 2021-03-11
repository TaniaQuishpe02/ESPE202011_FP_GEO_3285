/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.pkg0.pkg9.funcions;

/**
 *
 * @author 10
 */
public class Ws09Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quishpe Tania");
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

    
       
