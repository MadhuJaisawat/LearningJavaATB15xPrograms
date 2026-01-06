package ex_08_Java_Basics;

import java.util.Scanner;

public class FizzBuzz_Task {
    public static void main(String[] args) {
        System.out.println("Enter the value of num!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%3 == 0 && num%5 !=0) {
            System.out.println("Fizz");
        } else if (num%5 == 0 && num%3 != 0) {
            System.out.println("Buzz");

        } else if (num%3 ==0 && num%5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(" This is not multiple of 3 or 5 ");
        }
sc.close();
    }
}
