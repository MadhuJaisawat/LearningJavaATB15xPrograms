package ex_05_TypeCaCasting;

public class Typecasting_RealEx {
    public static void main (String[] args) {
        int course = 100;
        float f = 18.459f;
        //int total = course+f; // Narrowing -Implicit (there is no brackets)
        //int total = course + (int)f; //Narrowing - Explicit
        float total = course +f; //widening - implicit
        float total2 = (float)course+f; //widening- explicit- which is not required
        System.out.println(total);
        System.out.println(total2);
    }
}
