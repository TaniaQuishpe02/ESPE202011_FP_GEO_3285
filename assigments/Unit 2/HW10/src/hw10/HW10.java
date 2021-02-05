/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        System.out.println("================== " + " \n"
                + "| functions |" + "\n"
                + "======================= " + "\n"
                + "| welcome my friend  | " + "\n"
                + "| Quishpe Caiza Tania Lizeth ツ | " + "\n"
                + "| NRC 3285 | " + "\n"
                + "===================================");
        System.out.println("");
        System.out.println("● enter the value  the division ");
        System.out.println("Enter de dividend :");
         Scanner input = new Scanner(System.in);
        int dividend  = input.nextInt();

        System.out.println("Enter de divisor :");
        int divisor= input.nextInt();

        float quotient = 0;

        quotient = divideTwoNumbers(dividend , divisor);

        System.out.println("The quotient of " + dividend  + "/" +divisor+ " is-->" + quotient);

//SECOND PART-------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("● Enter the variable of which you want "
                + "to know its square :");

        int parameter = input.nextInt();
        int resultreturn = 0;

        resultreturn = SquareNumber(parameter);
        System.out.println(+parameter + "^6 = " + resultreturn);

        resultreturn = SquareNumber(-parameter);
        System.out.println("-" + parameter + "^6 = " + resultreturn);

        resultreturn = SquareNumber(parameter);
        System.out.println("The square of  " + parameter
                + " is equal to -> " + resultreturn);
        System.out.println("And the square of  -" + parameter
                + " is equal to -> " + resultreturn);

//THIRD PART--------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("● Enter the variable with which you want to carry out the process"
                + " following equation\n" + "(x ^ 6) + (6x) + 1 ---> (\"x\" is "
                + "the variable you are going to enter) ");
        System.out.println("");
        System.out.println(" Enter de variable :");

        int parameter2 = input.nextInt();
        int resultreturn1 = (parameter2 * parameter2) + (2 * parameter2) + 1;

        System.out.println("The result of : 2^" + parameter2
                + "(2*" + parameter2 + ")" + "+ 1 is : " + resultreturn1);

//FOURTH PART-------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("●Enter name "
                + "its multiplication table : ");

        int parameter3 = input.nextInt();

        System.out.println("The multiplication table of " + parameter3 + " is : "+ "");
        System.out.println("");

        int resultreturn2=1;
        int factor;
        for (factor = 1; factor <= 12; factor++) {
            resultreturn2=parameter3*factor;
            System.out.println(parameter3 + " x " + factor + " = " + resultreturn2);
        }
        System.out.println(" See you later classmates from the programming class ");

    }

//FIRST PROCESS................................................................
    public static float divideTwoNumbers(int dividend, int divisor) {
        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

//SECOND PROCESS....................................................................
    public static int SquareNumber(int variable) {
        int resultreturn = 0;

        resultreturn =variable * variable;

        return resultreturn;
    }

//THIRD PROCESS.......................................................................   
    public static int processtosolvetheequation(int variable2,int variable1,int variable3) {
        int resultreturn1 = 0;

        resultreturn1 = (variable1 * variable2) + (2 * variable3) + 1;

        return resultreturn1;
    }
//FOURTH PORCESS.................................................................

    public static int multiplication(int parameter3) {
        int resultreturn2 = 0;
        int factor = 1;

        return resultreturn2;
    }
}
        // TODO code application logic here
    
   
