//Define a method that returns the product of two numbers entered by user.

package com.shan.Method;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args){
        System.out.print("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Multiple of two number is "+ mul(a,b));
    }

    static int mul(int a, int b){
        return a*b;
    }
}
