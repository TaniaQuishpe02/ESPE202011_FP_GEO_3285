/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04;

import java.util.Scanner;


/*
 *
 * @author USER
 */
public class HW04  {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Multiplication");
            System.out.println("3. -> The are of a Rectangle");
            System.out.println("4. -> Cube fase area");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2-> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                    break;
                case 2:
                    System.out.println("The multiplication is");
                    break;
                case 3:
                    System.out.println("Enter rectangle");
                    int base;
                    int altura;
                    int areas;
                    System.out.println("Enter base ->");
                    base = input.nextInt();
                    System.out.println("Enter altura");
                    altura = input.nextInt();
            int area6 = base*altura; 
            System.out.println("The area of a rectangle");
                    break;
                case 4:
                    double arista;
                    double facearea;
                    System.out.println("Enter the length of the cube adge ->");
                    arista = input.nextInt();
                    facearea=arista*arista;
                    System.out.println("The cube face area is :" +facearea+"cm^6");
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 10);

    }
}