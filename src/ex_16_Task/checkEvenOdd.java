package ex_16_Task;
import java.util.Scanner;
//check whether a given number is even or odd using arithmetic operators.
public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =scanner.nextInt();
        if (num<0){
            System.out.println("Please provide positive integer only");
            return;
        } else {
            if (num % 2 == 0 || num == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is odd");
            }
        }
        scanner.close();

    }
}
