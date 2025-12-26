package ex_06_TernaryOperator;

public class Ternary_MaxThreeNum {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 10;
        int num3 = 15;
        int result = (num2 > num1) ? ((num3 > num2) ? num3 : num2) : num1;
        System.out.println(result);
    }
}
