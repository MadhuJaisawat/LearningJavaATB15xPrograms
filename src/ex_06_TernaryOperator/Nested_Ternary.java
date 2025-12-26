package ex_06_TernaryOperator;

public class Nested_Ternary {
    // condition within condition
    public static void main(String[] args) {
        int age = 21;
        String result = age >20 ? (age >25 ? "you can drink":"you can't drink") : "you can't go";
        System.out.println(result);
    }
}
