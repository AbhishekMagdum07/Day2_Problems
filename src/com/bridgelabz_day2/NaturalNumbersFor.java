package com.bridgelabz_day2;

import java.util.Scanner;

//1. Write a Program for the sum of n natural numbers,eg. Input N=5 output 1+2+3+4+5

public class NaturalNumbersFor {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input = ");
        int input = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=input ; i++) {
            sum += i;
        }
        System.out.println("Addition of first"+ input+" natural numbers is = "+sum);
    }
}
