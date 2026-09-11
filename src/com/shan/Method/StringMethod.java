package com.shan.Method;

import java.util.Scanner;

public class StringMethod  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        String result = greet(name);
        System.out.println(result);
    }

    static String greet(String name) {
        return "Hello " + name;
    }
}
