package ex_17_Strings;

public class toCharArray {
    public static void main(String[] args) {
        char[] a="Java".toCharArray();
        System.out.println(a);//['j','a','v','a']
        boolean b = " ".isBlank();//here string length is not 0, it has one char space.meaningful text
        boolean b2="".isEmpty();//checks length of string is 0
        System.out.println(b2);
        System.out.println(b);
        String s= "test".repeat(2);
        System.out.println(s);
        boolean b1="Test".equalsIgnoreCase("test");
        System.out.println(b1);
        long count ="a/n/te".lines().count();
        System.out.println(count);
    }
}
