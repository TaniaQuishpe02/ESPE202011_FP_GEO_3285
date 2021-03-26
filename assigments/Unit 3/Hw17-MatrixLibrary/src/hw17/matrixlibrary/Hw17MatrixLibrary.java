/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17.matrixlibrary;

import static ec.edu.espe.matrix.BasicMatrix.addTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.prettyPrinMatrix;
import static ec.edu.espe.matrix.BasicMatrix.readMatrix;
import static ec.edu.espe.matrix.BasicMatrix.transpose;
import java.util.Scanner;

/**
 *
 * @author 10
 */
public class Hw17MatrixLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int Row;
        int columns;
        
        float[][] matrixT;
        float[][] matrixN;
        float[][] Y;
        float[][] matrixJ;

        Scanner input = new Scanner(System.in);
        System.out.println(" ==== Good Mornig :) ====");
         System.out.println(" ==== Welcome My Friend ====");
        System.out.println(" ==== My name is Tania Lizeth ====");

        System.out.println(">>>>Enter the matrix dimensions<<<<<");
        System.out.print("\n columns ---> ");
        Row = input.nextInt();

        System.out.print("\n rows ---> ");
        columns = input.nextInt();

        matrixT = new float[Row][columns];
        matrixN = new float[Row][columns];
        matrixJ = new float[Row][columns];
        Y = new float[Row][columns];

        System.out.println("====== Enter the elements of the matrix ======");
        matrixT = readMatrix(Row, columns, "Matrix A", input);
        matrixN = readMatrix(Row, columns, "Matrix B", input);

        for (int tab = 0; tab <= Row / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("-------- > Matrix A");

        prettyPrinMatrix(Row, columns, matrixT);
        System.out.println("");

        System.out.println("-------- > Matrix B");

        prettyPrinMatrix(Row, columns, matrixN);
        System.out.println("");

        transpose(columns, Row, Y, matrixT);

        for (int tab = 0; tab <= Row / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("========The Transpose of matrice is ========");

        prettyPrinMatrix(Row, columns, Y);

        System.out.println("");
        System.out.println("======== The subtraction of matrices is ========");
       

        prettyPrinMatrix(Row, columns, matrixJ);

        System.out.println("");
        System.out.println("======== The sum of matrices is ========");

        matrixJ = addTwoMatrices(Row, columns, matrixT, matrixN);

        prettyPrinMatrix(Row, columns, matrixJ);

        System.out.println("");

        System.out.println("======== Bye :) ========");

    }

     
}


  


    
