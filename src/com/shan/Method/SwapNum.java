package com.shan.Method;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        swap(a,b);
        System.out.println("Previous number is "+a+" "+b);
    }

    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Present number is "+num1+" "+num2);
    }
}
