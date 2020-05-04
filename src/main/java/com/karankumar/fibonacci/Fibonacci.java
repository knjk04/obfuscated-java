package main.java.com.karankumar.fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = getInput();
        System.out.println("Fibonacci of " + n + " is " + runFibonnaci(n));
    }

    private static int getInput() {
        int n = Integer.MAX_VALUE;
        boolean invalid = true;

        while(invalid) {
            Scanner in = new Scanner(System.in);
            System.out.print("Which fibonacci number (minimum is 0) do you want (zero indexed): ");
            try {
                n = in.nextInt();
                if (n < 0) {
                    printInvalidFibonacciIndex();
                }

                if (n == Integer.MAX_VALUE) {
                    printInvalidFibonacciIndex();
                } else {
                    invalid = false;
                }
            } catch (InputMismatchException e) {
                printInvalidFibonacciIndex();
            }
        }

        return n;
    }

    private static void printInvalidFibonacciIndex() {
        System.out.println("Not a valid number. Please try again");
    }

    private static int runFibonnaci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return runFibonnaci(n-1) + runFibonnaci(n-2);
        }
    }
}
