package com.shan.Array;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args){
        int[] arr = {23, 65, 87, 54};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0]= 45;
    }
}
