package ex_17_Strings;

public class indexOf_Function {
    public static void main(String[] args) {
        int index="test".indexOf("s");
        int lastIndex="Test".lastIndexOf("t");
        System.out.println(index);
        System.out.println(lastIndex);
        boolean b="".isEmpty();
        System.out.println(b);
        String sNew=String.join("*","wonder","full");
        System.out.println(sNew);
        String sReplace="Madam".replace("a","o");
        System.out.println(sReplace);
        boolean resultB="Test".startsWith("T");
    }
}

