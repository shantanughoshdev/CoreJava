package com.shan.Linear_Search;

import java.util.Arrays;

public class MaxIn2dArray {
    static void main(String[] args) {
        int[][] arr = {
                {12,54,23},
                {10,20,30,40},
                {45,87},
                {67,45,23}
        };
        int target =30;
        int ans = max(arr);
        System.out.println(ans);

    }
    static int max(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr)
            for (int anInt : ints)
                if (anInt > max)
                    max = anInt;
        return max;
    }
}