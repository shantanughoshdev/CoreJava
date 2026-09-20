package com.shan.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23,54,6,78,45,35};
//        swap(arr,0,1);
        reversearray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reversearray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
