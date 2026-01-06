package ex_08_Java_Basics;

import java.util.Scanner;

public class If_Else_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age !");
        //int age = scanner.nextInt();
        double age = scanner.nextDouble();
        System.out.println(age);
        //we have to provide only integer values otherwise it will give error
    }
}
