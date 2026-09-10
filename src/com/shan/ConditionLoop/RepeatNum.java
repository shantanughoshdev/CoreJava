package com.shan.ConditionLoop;

import java.util.Scanner;

public class RepeatNum {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for search :");
        int n = in.nextInt();
        int count = 0;
        System.out.println("Enter the number required which is repeated:");
        int target = in.nextInt();
        int r;
        while(n>0){
            r = n%10;
            n= n/10;
            if(r == target){
                count++;
            }
        }
        System.out.println("The repeated digit as per required is "+count);

    }
}
