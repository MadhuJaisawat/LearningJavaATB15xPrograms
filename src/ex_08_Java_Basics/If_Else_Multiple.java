package ex_08_Java_Basics;

import java.util.Scanner;

public class If_Else_Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();
        System.out.println("Enter the age !");
        int age = scanner.nextInt();
        //if we want to take string input
        // String name = scanner.next();
        //int age = 30;
        if (age >30) {
            System.out.println("age is more than 30");
        } else if (age <30) {
            System.out.println("age is less than 30");
            
        } else {
            System.out.println(" age is euals to 30");
        }
        scanner.close();
    }
}
