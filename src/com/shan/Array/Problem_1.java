package com.shan.Array;

import java.util.Arrays;

public class Problem_1 {
    public static void main(String[] args){
        int[] arr = {1,0,2,4,3,5};

        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void permutation(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                if(i==arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
