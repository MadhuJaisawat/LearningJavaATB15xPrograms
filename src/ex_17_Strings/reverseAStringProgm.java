package ex_17_Strings;

import java.util.Scanner;

public class reverseAStringProgm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String input =sc.next();
        String reverse = "";

        for (int i=input.length()-1;i>=0;i--) {
            reverse = reverse + input.charAt(i);

        }
        System.out.println(reverse);
    }
}
