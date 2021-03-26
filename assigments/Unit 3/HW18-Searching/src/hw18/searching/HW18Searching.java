/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18.searching;

import java.util.Scanner;

/**
 *
 * @author 10
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] ages  = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int animals;
        int x = 0;
        int search;
        int binarySearch;

        System.out.println(" ==== Good Mornig :) ====");
        System.out.println(" ==== Welcome My Friend ====");
        System.out.println(" ==== My name is Tania Lizeth ====");
        System.out.println ("2, 4, 6, 8, 10, 12, 14, 16, 18, 20");
        System.out.println("====LINEAR  SEARCH ====");
        System.out.println(" ");

        System.out.println(" >>>>> Enter the age of the animals <<<<<< ");
        animals= input.nextInt();
        System.out.println("the Toys price " + animals + " the price of the animals is in the range: " + search(ages, animals,x));

        System.out.println("=== BINARY  SEARCH ==== ");
        System.out.println(" ");

        System.out.println(" >>>>>> Enter the age of the animals <<<<<<< ");
        animals = input.nextInt();
        System.out.println("the ages " + animals + " the price of the animals is in the range: " + binarySearch(ages, animals));
    }

    private static int binarySearch(int[] ages, int animals) {
        int n = ages.length;
        for (int i = 0; i < n; i++) {
            if (ages [i] == animals) {
                return i;
            }
        }
        return -1;
    }

    private static int search(int[] ages, int animals, int x) {
        {
            int n = ages.length;
            
            for (int i = 0; i < n; i++)
            {
                if (ages[i] == x)
                    return i;
            }
        }
            return -1;
   
    }
    
}
