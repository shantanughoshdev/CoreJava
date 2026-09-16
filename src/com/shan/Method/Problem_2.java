//Define a program to find out whether a given number is even or odd.

package com.shan.Method;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("--Check number is even or odd--");
        System.out.println("Enter number");
        int n = input.nextInt();
        boolean flag = iseven(n);
        if(flag == true){
            System.out.println("The number is even");
        }else
            System.out.println("The number is odd");

    }

    static boolean iseven(int n){
        if(n%2 == 0){
            return true;
        }return false;
    }
}
