package com.shan.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
        int target = 6;
        System.out.println(linear_search1(arr,target));
    }

    //search the target and return index value
    static int linear_search(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //search the target and return the target value
    static int linear_search1(int[] arr, int target){
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return target;
            }
        }
        return Integer.MAX_VALUE;
    }

    //search the target and return true or false
    static boolean linear_search2(int[] arr, int target){
        if(arr.length == 0) {
            return false;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
