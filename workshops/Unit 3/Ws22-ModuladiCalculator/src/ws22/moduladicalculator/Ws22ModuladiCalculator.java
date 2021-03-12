/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22.moduladicalculator;

import java.util.Scanner;
import Utils.BasicOperations; 

/**
 *
 * @author 10
 */
public class Ws22ModuladiCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float operand1;
        float operand2;
        float result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();
        
         result=BasicOperations.addTwoNumbers(operand1, operand2);
        System.out.println("----- ADITTION-----");
        System.out.println(operand1 + " + " + operand2+ " = " +result);
        
        result=BasicOperations.MultiplicationTwoNumbers(operand1, operand2);
          System.out.println("----- SUBTRACTION-----");
        System.out.println(operand1 + " - " + operand2+ " = " +result);
        
          result=BasicOperations.addTwoNumbers(operand1, operand2);
        System.out.println("----- Multiplication-----");
        System.out.println(operand1 + " * " + operand2+ " = " +result);
        
        result=BasicOperations.addTwoNumbers(operand1, operand2);
        System.out.println("----- Division-----");
        System.out.println(operand1 + " / " + operand2+ " = " +result);
        
        
        
    }
    
}
