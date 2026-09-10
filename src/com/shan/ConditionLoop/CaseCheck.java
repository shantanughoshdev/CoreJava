package com.shan.ConditionLoop;

import java.util.Scanner;

public class CaseCheck {
    static void main() {
        Scanner in = new Scanner(System.in);
//        char ch =  in.next().charAt(0);
        char ch = in.next().trim().charAt(0);
//        String word = "Shantanu";
//        System.out.println(word.charAt(5));

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}
