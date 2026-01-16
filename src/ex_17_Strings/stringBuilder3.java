package ex_17_Strings;

public class stringBuilder3 {
    public static void main(String[] args) {
        StringBuilder s0= new StringBuilder("test");
        s0.append("dummy");
        s0.reverse();
        s0.replace(1,3,"ful");
        System.out.println(s0);
    }
}
