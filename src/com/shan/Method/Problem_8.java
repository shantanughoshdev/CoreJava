//Write a program to print the factorial of a number by defining a method named 'Factorial'.

package com.shan.Method;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args){
        System.out.println("--Finding the factorial of the given number--");
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    static int factorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        for(int i = n; i>0; i--){
            fact *= i;
        }
        return fact;
    }
}
