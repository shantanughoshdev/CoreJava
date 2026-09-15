package com.shan.Method;

public class Shadowing {
    static int a = 43;

    static void main() {
        System.out.println(a);
        int a;
        a=4;
        System.out.println(a);
        fun();
    }

    static void fun(){
        System.out.println(a);
    }
}
