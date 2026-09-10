package com.shan.Switch;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose food category :");
        System.out.println("1.Burger\n" + "2.Pizza\n" + "3.Drink\n");
        System.out.println("Enter number to choose: ");
        int category = in.nextInt();

        switch (category) {
            case 1 -> {
                System.out.println("Burger Menu:");
                System.out.println("1.Zinger Chicken Burger\n" + "2.Veg Burger\n" + "3.Mexican Burger\n");
                System.out.println("Enter number to choose: ");
                int choice1 = in.nextInt();

                switch (choice1) {
                    case 1 -> System.out.println("You ordered Zinger Chicken Burger");
                    case 2 -> System.out.println("You ordered Veg Burger");
                    case 3 -> System.out.println("You ordered Mexican Burger");
                    default -> System.out.println("Invalid choice");
                }
            }
            case 2 -> {
                System.out.println("Pizza Menu:");
                System.out.println("1.Margherita\n" + "2.Chicken Dominator\n" + "3.Onion Pizza\n");
                System.out.println("Enter number to choose: ");
                int choice2 = in.nextInt();

                switch (choice2) {
                    case 1 -> System.out.println("You ordered Margherita");
                    case 2 -> System.out.println("You ordered Chicken Dominator");
                    case 3 -> System.out.println("You ordered Onion Pizza");
                    default -> System.out.println("Invalid choice");
                }
            }
            case 3 -> {
                System.out.println("Drink Menu:");
                System.out.println("1.Dry Martini\n" + "2.Mojito\n" + "3.Margarita\n");
                System.out.println("Enter number to choose: ");
                int choice3 = in.nextInt();
                switch (choice3) {
                    case 1 -> System.out.println("You ordered Dry Martini");
                    case 2 -> System.out.println("You ordered Mojito");
                    case 3 -> System.out.println("You ordered Margarita");
                    default -> System.out.println("Invalid choice");
                }
            }
        }
    }
}
