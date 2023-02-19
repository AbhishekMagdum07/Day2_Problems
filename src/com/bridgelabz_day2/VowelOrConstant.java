package com.bridgelabz_day2;

// 1. Write a Program to Check Vowel or Consonant

import java.util.Scanner;
public class VowelOrConstant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character = ");
        char input = sc.next().charAt(0);

        switch (input) {

            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : System.out.println(input+" is a Vowel"); break;
            default  : System.out.println(input+" is a Consonant");
        }
    }
}
