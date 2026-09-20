package com.shan.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list= new ArrayList<>(5);

        list.add(34);
        list.add(56);
        list.add(75);
        list.add(436);
        list.add(3634);
        list.add(87);
        list.add(46);
        list.add(100);

        System.out.println(list);
        list.set(4, 12);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(34));
        System.out.println(list.size());


//        for(int i = 0; i<5; i++){
//            list.add(sc.nextInt());
//        }
//
//        for(int i = 0; i<5; i++){
//            System.out.print(list.get(i)+ " ");
//        }
    }
}
