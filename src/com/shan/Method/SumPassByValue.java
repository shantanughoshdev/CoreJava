package com.shan.Method;

public class SumPassByValue {
    public static void main(String [] args){
        int result = add(23,76);
        System.out.println(result);
    }
    // pass by value when calling method
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
