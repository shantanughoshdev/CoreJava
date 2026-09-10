package com.shan.Switch;

import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find name of day and check weekday/weekend: ");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Day is Monday");
            case 2 -> System.out.println("Day is Tuesday");
            case 3 -> System.out.println("Day is Wednesday");
            case 4 -> System.out.println("Day is Thursday");
            case 5 -> System.out.println("Day is Friday");
            case 6 -> System.out.println("Day is Saturday");
            case 7 -> System.out.println("Day is Sunday");
            default -> System.out.println("Enter valid day");

        }

//        System.out.println("Enter the number of day to find weekday / weekend : ");
//        int dayOfWeek = sc.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("This day is weekday");
            case 6,7 -> System.out.println("This day is weekend");
        }
    }
}
