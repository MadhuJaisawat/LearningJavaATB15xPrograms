package ex_17_Strings;

public class String_compareTo {
    public static void main(String[] args){
        int result= "abc".compareTo("abc");
        int result1="ABC".compareTo("abc");
        int result2="abc".compareTo("ABC");
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        //compareTo will be used in collection framework
        //it will compare first ASCII value like A=65 and a =97 so it will substract and return the value

    }
}
