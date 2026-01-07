package ex_16_Task;
//program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.

import java.util.Scanner;

public class Airthmatic_operation_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Integer");
        if (!sc.hasNextInt()) {
            System.out.println("Please provide number only");
            return;
        }
        int First_int = sc.nextInt();
        System.out.println("Enter the Second Integer");
        if (!sc.hasNextInt()) {
            System.out.println("Please provide number only");
            return;
        }
        int Second_int = sc.nextInt();
        //if (First_int && Second_int)
//calling sum function for sum of two integers....
        int result_sum = sum_of_two_integers(First_int, Second_int);
        System.out.println("Sum of two integers is " + " " + result_sum);
        //calling multiplication function....
        int result_multiplication = multiplication_of_two_integers(First_int, Second_int);
        System.out.println("Multiplication of two integers is" + " " + result_multiplication);
        //calling division function.....
        if (Second_int == 0) {
            System.out.println("Zero is not allowed as denominator ");
            return;
        } else {
            double result_division = division_of_two_integers(First_int, Second_int);
            System.out.println("Division of two integers is" + " " + result_division);
            //  System.out.println("Zero is not allowed as denominator");
            //calling Remainder function....
            if (Second_int > First_int) {
                System.out.println("Denominator should not be bigger than numerator");
                return;

            } else {
                int result_Remainder = remainder_of_two_integers(First_int, Second_int);
                System.out.println("Remainder of two integers is " + " " + result_Remainder);
            }
            sc.close();
        }
    }
    static int sum_of_two_integers(int a,int b){
        return a+b;
    }
    static int multiplication_of_two_integers(int a ,int b) {
        return a*b;
    }

    static double division_of_two_integers(int a,int b) {
            return (double) a / b;

    }
    static int remainder_of_two_integers(int a ,int b) {
            return a%b;

    }

    }
