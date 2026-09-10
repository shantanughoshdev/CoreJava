package com.shan.ConditionLoop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to find Fibonacci series: ");
        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci series: ");
        for (int i = 0; i < n; i++){
            int temp = num2;
            System.out.print(num1 + " ");
            num2 += num1;
            num1 = temp;
        }
    }
}
