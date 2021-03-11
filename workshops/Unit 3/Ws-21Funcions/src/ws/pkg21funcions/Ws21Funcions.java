/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.pkg21funcions;

import java.util.Scanner;

/**
 *
 * @author 10
 */
public final class Ws21Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try (Scanner valor = new Scanner(System.in)) {
            double f,c,k;
            System.out.print("Quishpe Caiza Tania Lizath  ");
            System.out.print("Ingrese grados fahrenheit: ");
            f=valor.nextDouble();
            c = (f - 32 ) * 5 / 9;
            k = (f - 32 ) * 5 / 9 + 273;
            System.out.printf("Los grados cel son: %.3f \n Los grados kel son: %.3f",c, k);
            
        }
    }
}

         
        
      
       
    
       

    
        
    