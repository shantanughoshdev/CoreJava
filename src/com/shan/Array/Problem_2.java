//Concetenation of the array

//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1]

package com.shan.Array;

import java.util.Arrays;

public class Problem_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int[] arr =getConcatenation(nums);
        System.out.println(Arrays.toString(arr));
     }
//    static int[] concat(int[] nums){
//        int num = nums.length;
//        int[] ans = new int[2*num];
//
//        for(int i = 0; i<nums.length; i++){
//            ans[i] = nums[i];  //[1,2,3,0,0,0]
//        }
//        for(int i = 0, j = ans.length/2; i<nums.length; j++,i++){
//            ans[j] = nums[i];  //
//        }
//        return ans;
//    }

//   class Solution {
static int[] getConcatenation(int[] nums) {
           int n = nums.length;
          int[] ans = new int[2 * n];

            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }

            return ans;
        }
    }
//}
