/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;

import java.util.Scanner;

/**
 *
 * @author 10
 */
public class BasicMatrix {
    
    public static float[][] subtractionTwoMatrices 
        (int columns, int Row, float[][] matrixT, float[][] matrixB, float[][] matrixJ) {
        float[][] matrixC;
        matrixJ = new float[columns][Row];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < columns; j++) {
                matrixJ[i][j] = matrixT[i][j] - matrixB[i][j];
            }
        }
        return matrixJ;

    }

    public static float[][] readMatrix(int columns, int Row, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[columns][Row];
        for (int i = 0; i < columns; i++) {
            System.out.println("---ROW Numbers " + (i + 1) + "---");
            for (int j = 0; j < Row; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int Row, int columns, float[][] t, float[][] matrixT) {
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < columns; j++) {
                t[i][j] = matrixT[j][i];
            }
        }

    }

    public static float[][] addTwoMatrices(int columns, int Row, float[][] matrixT, float[][] matrixN) {
        float[][] matrixJ;
        matrixJ = new float[columns][Row];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < Row; j++) {
                matrixJ[i][j] = matrixT[i][j] + matrixN[i][j];
            }
        }
        return matrixJ;
    }

    public static void prettyPrinMatrix(int columns, int Row, float[][] matrix) {
        for (int i = 0; i < columns; i++) {
            System.out.println("");
            for (int j = 0; j < Row; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == columns - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (Row - 1)) {
                    System.out.print("\t");
                }
                if (j == (Row - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == columns - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
        }
        System.out.print("");
    }

}
    

