package com.bridgelabz_day2;

//3. Write a Program to find Palindrome Number

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();
        int reverse = 0;
        int digit = 0;
        int initialNum = input;

        for(int i = input ; input > 0; input /= 10){

            digit = input % 10 ;

            reverse = reverse * 10 + digit ;

        }
        System.out.println("ReverseNumber = "+reverse);

        if(initialNum == reverse) {
            System.out.println(initialNum+" is a Palindrome Number");
        }else {
            System.out.println(initialNum+" is not a Panildrome Number");
        }
    }
}
