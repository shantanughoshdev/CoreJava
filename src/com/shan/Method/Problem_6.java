package com.shan.Method;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        System.out.println("--Finding the circumference and area of circle--");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextDouble();
        System.out.println("Circumference of the circle is: " + circumference(radius));
        System.out.println("Area of the circle is: "+area(radius));
    }

    static double area(double r){
        return (Math.PI*r*r);
    }

    static double circumference(double r){
        return 2* Math.PI*r;
    }
}
