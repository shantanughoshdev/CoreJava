//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

package com.shan.Method;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args){
        System.out.println("--Check person is eligible for vote or not--");
        System.out.println("Enter the age of the person: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("is Person eligible for giving vote:\n"+iseligible(age));
    }

    static boolean iseligible(int age){
        if(age>=18){
            return true;
        }return false;
    }
}
