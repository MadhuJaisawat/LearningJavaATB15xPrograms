package ex_05_TypeCaCasting;

public class TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //
       // byte b = val;//implicit narrowing -big to small
        byte b= (byte) val;//Explicit Narrowing
        System.out.println(b);
        //00101100 //0+0+32+0+8+4+0+0
        //(0*2⁷)+(0*2⁶)+(1*2⁵)+(0*2⁴)+(1*2³)+(1*2²)+(0*2¹)+(0*2⁰)



    }
}
