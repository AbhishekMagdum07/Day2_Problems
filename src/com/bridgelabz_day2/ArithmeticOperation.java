package com.bridgelabz_day2;

//1. Enter two numbers and do the following arithmetic Operations find max and min.
//   i) a+b*c ii) c+a/b
//   iii) a%b+c iV) a*b+c

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a = ");
        double a = sc.nextDouble();
        System.out.println("Enter b = ");
        double b = sc.nextDouble();
        System.out.println("Enter c = ");
        double c = sc.nextDouble();

        double output1 = a + b * c ;
        double output2 = c + a / b ;
        double output3 = a % b + c ;
        double output4 = a * b + c ;

        System.out.println("1. a + b * c  = "+output1+"\n"+"2. c + a / b = "+output2+"\n"+"3. a % b + c = "+output3+"\n"+"4. a * b + c = "+output4);

        if(output1 > output2 && output1 > output3 && output1 > output4) {
            System.out.println("Maximum value is = "+ output1);
        }else if(output2 > output1 && output2 > output3 && output2 > output4) {
            System.out.println("Maximum value is = "+ output2);
        }else if(output3 > output1 && output3 > output2 && output3 > output4) {
            System.out.println("Maximum value is = "+ output3);
        }else if(output4 > output1 && output4 > output2 && output4 > output3) {
            System.out.println("Maximum value is = "+ output4);
        }

        if(output1 < output2 && output1 < output3 && output1 < output4) {
            System.out.println("Minimum value is = "+ output1);
        }else if(output2 < output1 && output2 < output3 && output2 < output4) {
            System.out.println("Minimum value is = "+ output2);
        }else if(output3 < output1 && output3 < output2 && output3 < output4) {
            System.out.println("Minimum value is = "+ output3);
        }else if(output4 < output1 && output4 < output2 && output4 < output3) {
            System.out.println("Minimum value is = "+ output4);
        }

    }
}
