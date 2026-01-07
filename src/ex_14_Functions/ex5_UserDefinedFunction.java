package ex_14_Functions;

import java.util.Scanner;

public class ex5_UserDefinedFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();

        //int result= sum_of_twoNumbers(3,4);
        int result= sum_of_twoNumbers(a,b);
        //we can't pass any other data type ,it should be matched
        System.out.println(result);

    }
    //static int sum_of_twoNumbers(){
    static int sum_of_twoNumbers(int a, int b){
        return a+b;
    }
    static void sum_of_twoNumbers() {
        System.out.println("this we can also write");
    }
    }

