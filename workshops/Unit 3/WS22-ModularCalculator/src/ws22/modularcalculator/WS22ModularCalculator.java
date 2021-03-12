/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22.modularcalculator;

import Utils.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author 10
 */
public class WS22ModularCalculator {

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
        
         result=BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println("----- ADITTION-----");
        System.out.println(operand1 + " + " + operand2+ " = " +result);
        result=BasicOperation.MultiplyTwoNumbers(operand1, operand2);
          System.out.println("----- SUBTRACTION-----");
        System.out.println(operand1 + " - " + operand2+ " = " +result);
        
          result=BasicOperation.MultiplyTwoNumbers(operand1, operand2);
        System.out.println("----- Multiplication-----");
        System.out.println(operand1 + " * " + operand2+ " = " +result);
        
        result=BasicOperation.DivideTwoNumbers(operand1, operand2);
        System.out.println("----- Division-----");
        System.out.println(operand1 + " / " + operand2+ " = " +result);
        
    }
       
}
