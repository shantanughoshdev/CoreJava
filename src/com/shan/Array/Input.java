package com.shan.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        //Array of primitive
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 56;
        arr[3] = 64;
        arr[4] = 98;
        System.out.println(arr[2]);

        //Another method
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            System.out.println(temp);
        }

        //Taking Input
//        int[] input = new int[5];
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the roll no:");
//        for(int i = 0; i< input.length; i++){
//            input[i] = sc.nextInt();
//        }
//        System.out.println("List of roll no. given by user :");
//        for(int i = 0; i< input.length; i++){
//            System.out.println(input[i]);
//        }
//        for(int num : input){
//            System.out.print(num+" ");
//        }
//        System.out.println(Arrays.toString(input));

        String[] str = new String[5];
        for(int i = 0; i< str.length; i++){
            str[i] = sc.next();
        }
//        for(int i = 0; i<str.length; i++){
//            System.out.print(str[i]+"  ");
//        }
        System.out.println(Arrays.toString(str));
    }

}
