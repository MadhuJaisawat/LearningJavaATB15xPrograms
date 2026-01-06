package task;

import java.util.Scanner;

public class ex14_FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int fact = 1;
        if (num == 0) {
            fact =1;
        }
        for (int i =1 ;i <= num;i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
