package com.shan.Method;

public class Scope {
    public static void main(String[] args) {
        int a = 12;
        int b = 45;
        {
            int c= 45;
           a = 76;
        }
        System.out.println(b); System.out.println(a);
    }

}
