//Write a program to print the sum of two numbers entered by user by defining your own method.

package com.shan.Method;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args){
        System.out.print("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Sum of two number is "+ sum(a,b));
    }

    static int sum(int a, int b){
        return a+b;
    }
}
