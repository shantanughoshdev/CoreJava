package com.shan.ConditionLoop;

public class Loop {
    static void main() {

        // While Loop
//        int count = 1;
//        while(count != 5){
//            System.out.println(count);
//            count++;
//        }

        //For Loop
        for (int count = 1; count != 5; count++) {
            System.out.println(count);
            System.out.println("Shan");
        }

        //While
        int i = 0;
        while (i != 5) {
            System.out.println("Shan");
            i++;
        }

        //do while
        System.out.println("----------------------");
        int x = 0;
        do {
            System.out.println("Shan");
            x++;
        }while (x < 5);


    }
}
