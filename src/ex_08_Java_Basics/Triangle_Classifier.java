package ex_08_Java_Basics;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        System.out.println( "Enter the side1!");
        //int side1 = Integer.parseInt(args[0]);
        //int side2 =Integer.parseInt(args[1]);
        //int side3 = Integer.parseInt(args[2]);
        //System.out.println(side1);
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        System.out.println( "Enter the side2!");
        int side2 = scanner.nextInt();
        System.out.println( "Enter the side3!");
        int side3 = scanner.nextInt();
        if ((side1==side2 && side1!=side3)||(side2==side3 && side2!=side1)||(side1==side3 && side1!=side2)) {
            System.out.println("Isosceles Triangle ");
        } else if (side1==side2 && side2==side3) {
            System.out.println("Equilateral Triangle");

        } else {
            System.out.println("Scalene Triangle ");
    }
    }
}
