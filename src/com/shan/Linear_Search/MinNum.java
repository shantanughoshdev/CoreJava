package com.shan.Linear_Search;

public class MinNum {
    static void main(String[] args) {
        int[] arr = {23,54,-76,12,89,35};

        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min=arr[0];
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
