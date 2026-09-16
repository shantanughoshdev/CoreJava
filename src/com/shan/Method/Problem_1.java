package com.shan.Method;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Find Max and Min number among three number---");
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();
        System.out.println("Maximum number among three : "+max(a,b,c));
        System.out.println(" ");
        System.out.println("Minimum number among three : "+min(a,b,c));
    }

    static int max(int a, int b, int c){
        int max = a;
        if(b>max){
            return b;
        }
        if(c>max){
            return c;
        }return a;
    }
    static int min(int a, int b, int c){
        int min = a;
        if(b<min){
            return b;
        }
        if(c<min){
            return c;
        }return a;
    }
}
