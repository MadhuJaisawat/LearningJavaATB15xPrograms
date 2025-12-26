package ex_06_TernaryOperator;

import java.sql.SQLOutput;

public class Ternary_RealAgeClassification {
    public static void main(String[] args) {
        //user will give you a user input.
        //we need to check if user is minor or adult
        //user will give input via command line
        String age_input_String = args[0];
        //but here we will get the input as String so we will have to use a method to change
        //string to integer
        System.out.println(age_input_String);
        //if we want to check age_input_string is actually a string we can use instanceof String
        System.out.println(age_input_String instanceof String);
        int age_input = Integer.parseInt(age_input_String);
        String result = (age_input > 18) ? ((age_input)>=60? "Senior Citizen":"Adult") : "Minor";
        System.out.println(result);




    }
}
