package com.shan.Array;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        //Store a number or name

        int a = 34;

        String name = "Shantanu";

        //Syntax of Array
//        datatype[] variable_name = new datatype[size];

//        Q: Store 5 student rollno
        int[] rollno = new int[5];
        int[] rollno1 = {12,54,23,12,54};

        int[] nos; // declaration of array nos is getting defined in stack memory
        nos = new int[5]; // here, actual object created in heap memory

//        System.out.println(rollno1[4]);

        String demo = null;
        System.out.println(demo);

        String[] arr = new String[5];
        arr[0] = "Shantanu";

    }
}
