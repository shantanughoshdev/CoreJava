package com.shan.ConditionLoop;

import java.util.Scanner;

public class LargestNum {
    static void main(String[] args) {

        //METHOD 1
//        Scanner input = new Scanner(System.in);
//        System.out.println("--Finding the largest number--");
//        System.out.print("Enter the 1st number : ");
//        float num1 = input.nextFloat();
//        System.out.print("Enter the 2nd number : ");
//        float num2 = input.nextFloat();
//        if(num1>num2){
//            System.out.println(num1 + " is largest number");
//        }else {
//            System.out.println(num2 + " is largest number");
//        }
//        input.close();

        //METHOD 2
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a > b) {
//            System.out.println("Largest number is " + a);
//        }else if(b > a ){
//            System.out.println("Largest number is " + b);
//        }else{
//            System.out.println("Largest number is " + c);
//        }

        //METHOD 3
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int max;
//        if (a > b && a > c) {
//            max = a;
//        } else if (b > a && b > c) {
//            max = b;
//        } else {
//            max = c;
//        }
//        System.out.println("Max number among 3 numbers : "+ max);

        //METHOD 4
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int max = a;
//
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println("Maximum number is " + max);

        //METHOD 5
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(c,Math.max(a,b));

        System.out.println("Max number is "+max);

    }
}
