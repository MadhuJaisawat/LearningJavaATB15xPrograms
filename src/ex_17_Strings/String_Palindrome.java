package ex_17_Strings;

import java.util.Scanner;
public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String p =sc.nextLine();
        String revString="";
        for (int i=p.length()-1;i>=0;i--){
            revString = revString+p.charAt(i);

        }
        if(revString.equalsIgnoreCase(p)){
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }


    }
}
