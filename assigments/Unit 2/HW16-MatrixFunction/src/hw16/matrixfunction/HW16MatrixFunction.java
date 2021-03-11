/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16.matrixfunction;

/**
 *
 * @author 10
 */
public class HW16MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int m;
        float[][] matrixA;
        float[][] matrixB;
        float[][] matrixC;
        float[][] matrixT;
        
        System.out.println("Please enter the matrix dimensions");
        System.out.print("\n m -> ");
        m = input.nextInt();

        System.out.print("\n n -> ");
        n = input.nextInt();

        matrixA = new float[m][n];
        matrixB = new float[m][n];
        matrixC = new float[m][n];
        matrixT = new float[m][n];

        System.out.println("Enter the elements of the matrix ");
        Scaner input = null;
        matrixA = readMatrixElements(m, n, "matrixA", input );
        matrixB = readMatrixElements(m, n, "matrixB", input);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("        matrixA");

        prettyPrinMatrix(m, n, matrixA);
        System.out.println("");

        System.out.println("        matrixB");

        prettyPrinMatrix(m, n, matrixB);
        System.out.println("");

        matrixtranspose(n, m, matrixT, matrixA);
                

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.println("t");
        }
        System.out.println("      matrixT");

        prettyPrinMatrix(m, n, matrixT);
        
        System.out.println("");

        System.out.println("The result of matrix substraction");

        matrixC = addTwoMatrices(m, n, matrixA, matrixB);

        prettyPrinMatrix(m, n, matrixC);
        
        System.out.println("");
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scaner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("ROW Numbers " + (i + 1) + "-");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void matrixtranspose(int n, int m, float[][] matrixT, float[][] matrixA) {
      for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                matrixT[i][j] = matrixA[j][i];
            }
        }

    }

    public static float[][] addTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        float[][] matrixC;
        matrixC = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static void prettyPrinMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌\t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");
                    } else {
                        System.out.print("|\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t┐");
                    } else if (i == m - 1) {
                        System.out.print("\t┘");
                    } else {
                        System.out.print(" \t|");
                    }
                }
            }
        }
        System.out.print("");
    }

    public static void prinMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("/ \t");
                    } else if (i == m - 1) {
                        System.out.println("\\\t");
                    } else {
                        System.out.println("| \t");
                    }
                }

                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t\\");
                    } else if (i == m - 1) {
                        System.out.println("\t/");
                    } else {
                        System.out.println("\t|");
                    }
                }
            }
        }
        System.out.println("");
    }

    private static class input {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public input() {
        }
    }
    
}
