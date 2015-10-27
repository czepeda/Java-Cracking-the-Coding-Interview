/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg7.set.zeros;

/**
 *
 * @author czepeda
 */
public class SetZeros {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        setZeros();

    }

    public static void setZeros() {

        int[][] matrix = new int[][]{
            {0, 2, 3, 4},
            {1, 8, 8, 7},
            {8, 9, 1, 2},
            {7, 4, 5, 4}};

        boolean[] row = new boolean[matrix.length];
        //System.out.println(row[0]);
        boolean[] column = new boolean[matrix[0].length];
        //System.out.println(matrix[0].length);

        // Store the row and column index with value 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;

                }
            }
        }

        // Set arr[i][j] to 0 if either row i or column j has a 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }

        }
        // Print array to be sorted
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
