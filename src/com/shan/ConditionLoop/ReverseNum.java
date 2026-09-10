package com.shan.ConditionLoop;

import java.util.Scanner;

public class ReverseNum {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for reverse :");
        int n = in.nextInt();
        int r = 0,temp = n;
        while(n != 0){
            r = (r*10)+ (n%10);
            n /= 10;
        }
        System.out.println("Reverse of "+temp+" is "+r);
    }
}
