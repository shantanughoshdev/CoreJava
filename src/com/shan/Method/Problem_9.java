package com.shan.Method;

import java.util.Scanner;

public class Problem_9  {
    public static void main(String[] args) {
        System.out.println("--Check number is Palindrome or not--");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(Palindrome(n) == true){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("The number is not Palindrome");
        }
    }

    static boolean Palindrome(int n){
        int original = n;
        int rem = 0;
        while(n>0){
            rem = n%10 + rem*10;
            n/=10;
        }
        if(original == rem){
            return true;
        }return false;
    }
}
