//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

package com.shan.Method;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args){
        System.out.println("--Display grades according to the marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        double marks = sc.nextDouble();
        System.out.println("According to the marks, grade is: "+ grade(marks));

    }

    static String grade(double marks){
        if(100 >= marks & marks >= 91) return "AA";
        else if(90 >= marks & marks >= 81){
            return "AB";
        } else if (80 >= marks & marks >= 71) {
            return "BB";
        }else if (70 >= marks & marks >= 61) {
            return "BC";
        }
        else if (60 >= marks & marks >= 51) {
            return "CD";
        }
        else if (50 >= marks & marks >= 41) {
            return "DD";
        }else
            return "Fail";
    }
}
