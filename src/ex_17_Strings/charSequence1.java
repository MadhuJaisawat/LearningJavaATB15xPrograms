package ex_17_Strings;

public class charSequence1 {
    public static void main(String[] args) {
        CharSequence s = "helpfull";
        System.out.println(s);
        System.out.println(s.subSequence(1,4));
        //it will run from index1 to 3 not 4, it will not count 4

    }
}
