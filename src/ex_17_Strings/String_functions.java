package ex_17_Strings;

import java.util.Locale;

public class String_functions {
    public static void main(String[] args){
        char A = 'A';
        System.out.println(A);
        String S1="Hello";
        System.out.println(S1.length());
        System.out.println(S1.toLowerCase());
        System.out.println(S1.toUpperCase());
        System.out.println(S1.concat("World"));
        //SCP- 4 strings - "Hello", hello, HELLO,HelloWorld
        // if String is already present like in upper case then it willnot create new string

    }
}
