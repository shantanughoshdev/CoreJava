package com.shan.Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

//        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = new int[3][3];



        // input
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row<arr2.length; row++){
            for(int col = 0; col<arr2[row].length; col++){
                arr2[row][col] = sc.nextInt();
            }
        }
//        for(int row = 0; row<arr2.length; row++){
//            System.out.println(Arrays.toString(arr2[row]));
//        }

        for(int num[] : arr2){
            System.out.println(Arrays.toString(num));
        }


    }
}
