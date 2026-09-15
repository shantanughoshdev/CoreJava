package com.shan.Method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        fun('a', 'b', 'c');
        trail(34,76,24,65,13);
        multiple(12,34, "Shantanu","Subh", "Subham");
    }

    static void fun( char ...v ){
        System.out.println(Arrays.toString(v));
    }
    static void trail( int ...v ){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b, String ...v){
        System.out.println( a+" "+b+ " " + Arrays.toString(v));
    }

}
