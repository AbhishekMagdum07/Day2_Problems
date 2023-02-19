package com.bridgelabz_day2;

//2. Write a Program to reverse the integer number
//     eg. Input n=231 reverse is 132

import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        int input = sc.nextInt();
        int reverse = 0;
        int digit = 0;
        while(input != 0 ) {
            digit = input % 10 ;

            reverse = reverse * 10 + digit ;

            input /= 10 ;
        }
        System.out.println("Reverse Number = "+ reverse);
    }
}
