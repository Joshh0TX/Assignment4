package org.example;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Two dimensional array

        // declaration
        int[][] coords;

        // Initialization
        coords = new int[3][3];

        // Array Initializer
        int[][] points = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // inserting
        coords[1][1] = 10;
        coords[0][0] = 20;
        System.out.println(points.length);

        // Accessing

        // Multiplication of Matrix
        int[][] matrix1 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int[][] result = new int[3][3];

        int rowColumnSum = 0;
        int row;
        int column;

        // Processing
        for (row = 0; row < matrix1[0].length; row++) {
            for (column = 0; column < matrix1.length; column++) {
                result[row][column] = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    rowColumnSum += matrix1[row][k] * matrix2[k][column];
                }

                result[row][column] = rowColumnSum;
                rowColumnSum = 0;
            }
        }

        for(int i = 0; i < matrix1[0].length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(result[i][j] + "   ");
            }
            System.out.println();
        }

    }
}