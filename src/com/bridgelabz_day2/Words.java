package com.bridgelabz_day2;

//2. Read a Number 1,10,100,1000 and display unit, ten hundred

import java.util.Scanner;
public class Words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        int input = sc.nextInt();

        if(input == 1) {
            System.out.println("One");
        }else if(input == 10) {
            System.out.println("Ten");
        }else if(input == 100) {
            System.out.println("Hundred");
        }else if(input == 1000) {
            System.out.println("Thousand");
        }else if(input == 10000) {
            System.out.println("Ten Thousand");
        }else if(input == 100000) {
            System.out.println("Hundred Thousand");
        }else if(input == 1000000) {
            System.out.println("One Million");
        }else {
            System.out.println("Enter Valid Input");
        }
    }
}
