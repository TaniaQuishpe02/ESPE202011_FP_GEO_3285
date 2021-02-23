/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Tania Lizeth")
    public static void main(String[] args) {
        // TODO code application logic here
      
        int[] pets;
        String[] animals= {"Dog", "cat", "rabbit"};
      
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter the number of animal weight-> ");
        n = input.nextInt();

       pets = new int[n];
      
           for(int i = 0; i < n; i ++ ){
           System.out.println("enter the weight of the animal ->"+ (i + 1) + " ->");
           pets[i] = input.nextInt();
       }
       for (int animal:pets ) {
            System.out.println("pets animlas "+ animal);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("pest animals " + (i + 1) + " -> " + pets[i]);
        }

        for (String animlas : animals ) {
            System.out.println("animals name -> " + animlas);
        }
    }
    
}




   
    

