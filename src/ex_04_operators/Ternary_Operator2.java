package ex_04_operators;

public class Ternary_Operator2 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        // Print max of three
        int Max_Number= (n2>n1) ? n2:(n1>n3 ?n1:n3);
        System.out.println(Max_Number);

    }
}
