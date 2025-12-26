package ex_05_TypeCaCasting;

public class TypeCasting_CharEx {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch; //widening
        int a = 44; //Narrow
        char ch1 = (char) a;
        System.out.println(ch1);
    }
}
