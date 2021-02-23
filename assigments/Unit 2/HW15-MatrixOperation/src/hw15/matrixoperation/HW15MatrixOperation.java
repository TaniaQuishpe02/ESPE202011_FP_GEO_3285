/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * Tania Lizeth Quishpe Caiza 
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int matrizc[][] = new int [3][3];
         int matrizS[][] = new int [3][3];
         int matriZN[][] = new int [3][3];
         int i, j;
         
         Scanner dato= new Scanner (System.in);
         
         System.out.println("Data of the matrix C :");
         
         for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Enter of  the value " + i + " , " + j + " : ");
                 matrizc [i][j]= dato.nextInt();
                }
            }
            
            System.out.println("Data of the matrix S :");
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Enter of the value " + i + " , " + j + " : ");
                 matrizS[i][j]= dato.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matriZN [i][j]= matrizc[i][j]+matrizS[i][j];
                }
            }
            
            System.out.println("Result of the matrix Sum :");
    for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print(matriZN[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
}
            
  
 
    
    
