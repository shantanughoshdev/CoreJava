package com.shan.Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main(String[] args) {
         int[][] arr = {
                 {12,54,23},
                 {10,20,30,40},
                 {45,87},
                 {67,45,23}
         };
         int target =30;
         int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr , int target) {
        int row, col;
        for(row = 0; row< arr.length; row++){
            for(col = 0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};

                }
            }
        }
        return new int[]{-1,-1};
    }
}
