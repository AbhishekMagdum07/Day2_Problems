package com.bridgelabz_day2;

import java.util.Scanner;

//1. Read a single Digit inputber and write in word
public class SingleDigitNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();

        if(input == 0) {
            System.out.println("Zero");
        }else if(input == 1) {
            System.out.println("One");
        }else if(input == 2) {
            System.out.println("Two");
        }else if(input == 3) {
            System.out.println("Three");
        }else if(input == 4) {
            System.out.println("Four");
        }else if(input == 5) {
            System.out.println("Five");
        }else if(input == 6) {
            System.out.println("Six");
        }else if(input == 7) {
            System.out.println("Seven");
        }else if(input == 8) {
            System.out.println("Eight");
        }else if(input == 9) {
            System.out.println("Nine");
        }else {
            System.out.println("Enter valid Input");
        }
    }
}
