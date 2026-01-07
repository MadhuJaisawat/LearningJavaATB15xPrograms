package ex_16_Task;
//print the name of the day based on a number (1–7) using a switch statement.
import java.util.Scanner;
public class days_week {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number from 1 to 7");
            if (sc.hasNextInt()) {
                int day = sc.nextInt();
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Please enter the number from 1 to 7");
                        break;
                    // this program has problem as if we provide user input 1 then it will go to all conditions

                }
            } else {
                System.out.println("invalid input");
            }
            System.out.println("End of Progm");
        }
    }




