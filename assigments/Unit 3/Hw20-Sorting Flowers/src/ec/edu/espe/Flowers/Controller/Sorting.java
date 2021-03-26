/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Flowers.Controller;

/**
 *
 * @author 10
 */
public class Sorting {

    public static String[] sortFlowers(String[] Flowers){
         for (int j = 0; j < 5 ; j++) {
             for (int i = 0; i < 5; i++) {
        
           if (Flowers[i].compareTo(Flowers[i+1])>0) {
                
                    String temp;
                    temp = Flowers[i];
                    Flowers[i] = Flowers[i + 1];
                    Flowers[i + 1] = temp;
                }
               
                
            }
            }
            return Flowers;
           
        }
   
    
    }

