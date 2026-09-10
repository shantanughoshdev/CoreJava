package com.shan.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of fruit : ");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruit");
            case "Apple" -> System.out.println("A sweet of the fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter valid fruit name ");
        }
    }
}
