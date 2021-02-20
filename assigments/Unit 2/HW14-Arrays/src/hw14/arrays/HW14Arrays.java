/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.arrays;

import java.util.Scanner;

/**
 *
 * @Tania Lizeth 
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Stationery;
        String[]noteBooks= {"Paintings", "lines", "millimeter"};
        float[] numberSheets= { 100F, 60F, 100F };
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter the number of noteBooks-> ");
        n = input.nextInt();

       Stationery = new int[n];
       //noteBooks  = new String[10];
        //numerSheets = new float[n];

//        Stationery[1] = 6;
//        Stationery[2] = 4;
//        Stationery[3] = 2;
       for(int i = 0; i < n; i ++ ){
           System.out.println("enter the numbers of noteBooks of the Stationery ->"+ (i + 1) + " ->");
           Stationery[i] = input.nextInt();
       }
       for (int notebooks :Stationery ) {
            System.out.println("stationery notebooks"+ notebooks);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("stationery notebook " + (i + 1) + " -> " + Stationery[i]);
        }

        for (String noteBook : noteBooks ) {
            System.out.println("noteBooks name -> " + noteBook);
        }
        
        for (int i = 0; i < numberSheets.length ; i++) {
            System.out.println("number of Sheets " + (i + 1) + " -> " + numberSheets[i]);

      
        
        }

    }

}
