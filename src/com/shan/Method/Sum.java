package com.shan.Method;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum of the two number : "+result);
    }

    // with return type

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}