package com.shan.Method;

public class MethodOverloading {
    static void main(String[] args) {
//        demo(23);
//        demo("Shantanu");
//        demo('a');
//        sum(23,65);
//        sum(23.4f,45f);
//        sum(23,45f);
//        sum(34,6f);
//        sum('d',54f);
//        sum(34.6,56.4);
        sum(23,65,43);
    }
    static void demo(int num){
        System.out.println(num);
    }
    static void demo(String name){
        System.out.println(name);
    }
    static void demo(char a){
        System.out.println(a);
    }

    static void sum(int a , int b){
        System.out.println(a+b);
    }
    static void sum(float a , float b){
        System.out.println(a+b);
    }
    static void sum(double a , float b){
        System.out.println(a+b);
    }
    static void sum(int a , float b){
        System.out.println(a+b);
    }
    static void sum(char a , float b){
        System.out.println(a+b);
    }
    static void sum(double a, double b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
