package com.company;

import java.util.Scanner;

public class Main {
    //HOMEWORK
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the position you want: ");
//        int position = scanner.nextInt();
//
//        int[] fibonacci = new int[21];
//        fibonacci[0] = 1;
//        fibonacci[1] = 1;
//
//        for (int i = 2; i < fibonacci.length; i++) {
//
//            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//
//        }
//        for (int i = 0; i < fibonacci.length; i++) {
//            if (position == i) {
//                System.out.println(fibonacci[i - 1]);
//            }
//        }


// 2ND SOLUTION
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 0;

        for (int i = 2; i < upperLimit; i++) {
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
        }
        System.out.println("The number of the febonacci sequence at " + upperLimit + "is" + currentNumber);

    }
}
