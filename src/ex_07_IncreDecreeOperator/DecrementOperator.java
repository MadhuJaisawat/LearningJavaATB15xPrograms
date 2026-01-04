package ex_07_IncreDecreeOperator;

public class DecrementOperator {
    public static void main(String[] args) {
        int a = 12;
        int b = --a;
        //first decrement the value then assign
        //ERT
        //line no|a|b
        //5|12|NA
        //6|11|11
        System.out.println(b);
        System.out.println(a);
    }
}
