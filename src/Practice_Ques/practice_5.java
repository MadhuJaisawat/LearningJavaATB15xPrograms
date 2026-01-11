package Practice_Ques;

import java.util.Scanner;

public class practice_5 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the grade");
        int a = scanner.nextInt();
        //int b = scanner.nextInt();
        if (a>90 && a<=100){
            System.out.println("GradeA");

        } else if (a>80 && a<=90) {
            System.out.println("grade B");
        } else {
            System.out.println("Please provide the valid input");
        }
        scanner.close();


    }
}
