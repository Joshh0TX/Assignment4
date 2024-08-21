//This was hard...
package org.example;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        //Matrix input row 1 col 1
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter matrix, r1c1");
        int row1Col1 = scanner1.nextInt();

        //Matrix input row 1 col 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter matrix, r1c2");
        int row1Col2 = scanner2.nextInt();

        //Matrix input row 1 col 3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter matrix, r1c3");
        int row1Col3 = scanner3.nextInt();

        //Matrix input row 1 col 4
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter matrix, r1c4");
        int row1Col4 = scanner4.nextInt();

        //Matrix input row 2 col 1
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter matrix, r2c1");
        int row2Col1 = scanner5.nextInt();

        //Matrix input row 2 col 2
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Enter matrix, r2c2");
        int row2Col2 = scanner6.nextInt();

        //Matrix input row 2 col 3
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Enter matrix, r2c3");
        int row2Col3 = scanner7.nextInt();

        //Matrix input row 2 col 4
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Enter matrix, r2c4");
        int row2Col4 = scanner8.nextInt();

        //Matrix input row 3 col 1
        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Enter matrix, r3c1");
        int row3Col1 = scanner9.nextInt();

        //Matrix input row 3 col 2
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Enter matrix, r3c2");
        int row3Col2 = scanner10.nextInt();

        //Matrix input row 3 col 3
        Scanner scanner11 = new Scanner(System.in);
        System.out.println("Enter matrix, r3c3");
        int row3Col3 = scanner11.nextInt();

        //Matrix input row 3 col 4
        Scanner scanner12 = new Scanner(System.in);
        System.out.println("Enter matrix, r3c4");
        int row3Col4 = scanner12.nextInt();



        //Matrix input
        int[][][] matrix = {{new int[]{row1Col1}, new int[]{row1Col2}, new int[]{row1Col3}, new int[]{row1Col4}},
                {new int[]{row2Col1}, new int[]{row2Col2}, new int[]{row2Col3}, new int[]{row2Col4}},
                {new int[]{row3Col1}, new int[]{row3Col2}, new int[]{row3Col3}, new int[]{row3Col4}},
        };

        //Setting conditions
        for (int i = 0; i < matrix.length ; i++) {

        }
    }
}
