package ex_08_Java_Basics;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the score!");
        Scanner sc= new Scanner(System.in);
        int score = sc.nextInt();
        if (score >=90 && score <=100) {
            System.out.println("Grade A");
        } else if ( score >=80 && score <90) {
            System.out.println("Grade B");
        } else if (score >=70 && score<80) {
            System.out.println("Grade C");
        } else if (score >=60 && score <70) {
            System.out.println("Grade D");
        } else if (score>=0 && score <60) {
            System.out.println(" Grade F");
        } else {
            System.out.println(" please enter the score from 0 to 100 only");
        }
    }
}
