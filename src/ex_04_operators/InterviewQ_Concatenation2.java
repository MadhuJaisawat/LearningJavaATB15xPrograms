package ex_04_operators;

public class InterviewQ_Concatenation2 {
    public static void main(String[] args) {
        String first_name = "Madhu";
        String last_name = "jaisawat";
        int a = 10;
        int b = 20;
        System.out.println(first_name+last_name+a+b);
        // JVM goes left to right so first it will do concatenation of string and then numbers
        //answer would be Madhujaisawat1020
        // if first time it's doing concatenation second time it will also do concatenation.
        System.out.println(a+b+first_name+last_name);
        //incase of integers it will do addition and then concatenation
        //answer would be 30Madhujaisawat
        System.out.println(first_name+last_name+(a+b));
        //answer would be Madhujaisawat30

    }
}
