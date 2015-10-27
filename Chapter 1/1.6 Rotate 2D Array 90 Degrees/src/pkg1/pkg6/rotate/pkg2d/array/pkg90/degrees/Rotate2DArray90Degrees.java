/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg6.rotate.pkg2d.array.pkg90.degrees;

/**
 *
 * @author czepeda
 */
public class Rotate2DArray90Degrees {

    public static void main(String[] args) {

        rotate();
    }

    public static void rotate() {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 8, 7, 6},
            {5, 4, 3, 2}};

        // 4
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; ++layer) {
            // first 0
            // first 1
            int first = layer;
            // last 4 - 1 - 0 = 3
            // last 4 - 1 - 1 = 2
            int last = n - 1 - layer;
            // i = 0    0 < 3
            // i = 1    1 < 2
            for (int i = first; i < last; ++i) {

                // offset 0 - 0 = 0
                // offset 1 - 0 = 1
                // offest 2 - 0 = 1
                int offset = i - first;
                // save top [0][0]
                // save top [0][1]
                // save top [0][2]
                int top = matrix[first][i];
                // left -> top [0][0] = [3-0][0]
                // left -> top [0][1] = [3-1][0]
                // left -> top [0][2] = [3-2][0]
                matrix[first][i] = matrix[last - offset][first];
                // bottom -> left [3][0] = [3][3-0]
                // bottom -> left [2][0] = [3][3-1] 
                // bottom -> left [1][0] = [3][3-2]
                matrix[last - offset][first] = matrix[last][last - offset];
                // right -> bottom [3][3-0] = [0][3]
                // right -> bottom [2][3-0] = [1][3]
                // right -> bottom [1][3-0] = [2][3]
                matrix[last][last - offset] = matrix[i][last];
                // top -> right [0][3] = [0][0](top)
                // top -> right [1][3] = [0][1](top)
                // top -> right [2][3] = [0][2](top)
                matrix[i][last] = top;
            }
        }

        // Print the sorted 2-d array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
