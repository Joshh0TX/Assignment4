package org.example;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Check for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int input = Integer.parseInt(scanner.nextLine());

        //Conditions
        if (input % 2 == 0) {
            System.out.print("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
