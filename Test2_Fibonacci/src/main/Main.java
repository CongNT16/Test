/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Laputa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the desired location of fibonacci: ");
        int num = checkInt(scanner.nextLine());  //check input number is an integer
        System.out.println("The " + num + "th fibonacci number is: " + getNthElementFibonacci(num));
    }

    public static int getNthElementFibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                firstNumber = secondNumber;
                secondNumber = nextNumber;
                nextNumber = firstNumber + secondNumber;
            }
        }
        return nextNumber;
    }

    public static int checkInt(String input) {
        int num = 0;
        try {
            num = Integer.parseInt(input);
            if (num < 1) {
                System.out.println("Number must be a positive integer.");
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Number must be an integer.");
            System.exit(0);
        }
        return num;
    }
}
