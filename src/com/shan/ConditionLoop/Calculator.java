package com.shan.ConditionLoop;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner in = new Scanner(System.in);

        int result = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%') {
                System.out.print("Enter the first number :");
                int num1 = in.nextInt();
                System.out.println("Enter the second number :");
                int num2 = in.nextInt();

                if (op == '+'){
                    result = num1 + num2;
                }
                if (op == '-'){
                    result = num1 - num2;
                }
                if (op == '*'){
                    result = num1 * num2;
                }
                if (op == '/'){
                    if(num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (op == '%'){
                    result = num1 % num2;
                }

            }else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
            System.out.println("Output of following  operation: "+result);
        }
    }
}
