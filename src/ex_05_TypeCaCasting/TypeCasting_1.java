package ex_05_TypeCaCasting;

public class TypeCasting_1 {
    public static void main(String[] args) {
        byte b = 5;
        int a = b; //valid syntex- will automatically done by JVM/Java compliler ,Implicit wise casting
        float f = b; //valid
        //boolean f = b ; // not valid as incompatible not possible
        int a1 = (int)b;// possible and Explicit widening but there is no use


    }
}
