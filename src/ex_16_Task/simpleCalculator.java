package ex_16_Task;
//program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int userInput = sc.nextInt();
        System.out.println("Please enter from 1 to 4 for addition,substraction,multiplication or division respectively");
        //int userInput = sc.nextInt();
        if (sc.hasNextInt()) {
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Perform Addition operation");
                    break;
                case 2:
                    System.out.println("Perform Substraction operation");
                    break;
                case 3:
                    System.out.println("Perform Multiplication operation");
                    break;
                case 4:
                    System.out.println("Perform division operation");
                    break;
                default:
                    System.out.println("Please enter from 1 to 4 only");
                    break;

            }

        } else {
            System.out.println("Please provide the valid input");
        }
    }
    }

