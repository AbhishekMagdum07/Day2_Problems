package com.bridgelabz_day2;

//1. Write a Program for the sum of n natural numbers
// eg. Input N=5 output 1+2+3+4+.

import java.util.Scanner;
public class NaturalNumberWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term till sum of natural numbers");
        int input = sc.nextInt();
        int i = 1;
        int output = 0;
        while(i <= input) {

            output = output + i ;
            i++;
        }
        System.out.println("Sum of first "+input+" natural numbers is = "+ output);

    }
}
