package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position you want: ");
        int position = scanner.nextInt();

        int[] fibonacci = new int[21];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {

            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }
        for (int i = 0; i < fibonacci.length; i++) {
            if (position == i) {
                System.out.println(fibonacci[i - 1]);
            }
        }
    }
}
