//Using call by reference
package org.example;

public class ValueExchange {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        method1();
    }

    public static void method1 () {
        int x = 10;
        int y = 5;

        System.out.println("The value of x is: " + x);
        System.out.println("Integer y is: " + y);
    }
}
