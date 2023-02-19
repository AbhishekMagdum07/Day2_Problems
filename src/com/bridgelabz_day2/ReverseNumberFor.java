package com.bridgelabz_day2;

//2. Write a Program to reverse the integer number

import java.util.Scanner;

public class ReverseNumberFor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();
        int reverse = 0;
        int digit = 0;

        for(int i = input ; input > 0; input /= 10){

            digit = input % 10 ;

            reverse = reverse * 10 + digit ;


        }
        System.out.println("ReverseNumber = "+reverse);
    }
}
