package ex_07_IncreDecreeOperator;

public class Increment_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        //ERT
        //line no |a|b
        //6|11|10
        int result = b + a;
        System.out.println(result);
    }
}
