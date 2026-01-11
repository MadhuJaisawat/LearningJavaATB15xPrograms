package ex_08_Java_Basics;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the year");
        //int year= scanner.nextInt();
        if (scanner.hasNextInt()) {
            int year= scanner.nextInt();
            if ((year%4 == 0 && year%100 !=0) || (year%400==0)){
                System.out.println("Leap year");
            } else {
                System.out.println("not a leap year");
            }

        } else {
            System.out.println("please provide valid year");
        }
        scanner.close();

    }
}
