package com.shan.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the list of number:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the range of the array :");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println("Maximum number among the list: "+max(arr));
        System.out.println("Maximum number among the range of given list: "+maxRange(arr,index1,index2));
    }

    static int max(int[] arr ){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    static int maxRange(int[] arr ,int index1, int index2){
        int max = arr[index1];
        for(int i = index1; i<=index2; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
