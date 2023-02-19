package com.bridgelabz_day2;

//3.Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//  Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//  can be found using a formula delta = b*b - 4*a*c
//  Root 1 of x = (-b + sqrt(delta))/(2*a)
//  Root 2 of x = (-b - sqrt(delta))/(2*a)
//  Take a, b, and c as input values to find the roots of x

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b = ");
        double b = sc.nextDouble();
        System.out.println("Enter value of c = ");
        double c = sc.nextDouble();
        double root1, root2;


        double determinant = b * b - 4 * a * c; // determinant = (B2 - 4ac);

        if (determinant > 0) { // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }else if (determinant == 0) { //two real and equal roots
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        } else {// roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
