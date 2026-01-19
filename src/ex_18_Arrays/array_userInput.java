package ex_18_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class array_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
       // String[] marks=new String[size];
        int [] marks= new int[size];
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks");
            marks[i]=sc.nextInt();
        }
        System.out.println("---------------");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }

}
