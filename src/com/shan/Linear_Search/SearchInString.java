package com.shan.Linear_Search;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Shantanu";
        char target = 'n';

        System.out.println(SearchString(str,target));
    }

    static boolean SearchString2(String str, int target){
        if(str.isEmpty()){
            return false;
        }
        for(char ch : str.toCharArray() ){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean SearchString(String str, int target){
        if(str.isEmpty()){
            return false;
        }
        for(int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
