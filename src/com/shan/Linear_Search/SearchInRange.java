package com.shan.Linear_Search;

public class SearchInRange {
    static void main(String[] args) {
        int[] arr = {23,54,62,-5,1,55,78};

        System.out.println(search(arr,-5,6,4));
    }

    static boolean search(int[] arr ,int target,int start,int end){
        if(start>end){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
