package ex_17_Strings;

public class String_1 {
    public static void main(String[] args) {
        String name = "Test Automation";
        boolean result= name.contains("T");
        System.out.println(result);
        //Strings are immutable in nature means once created , it can't be removed.
        //like if we store something else in name for eg- web testing then this should be the
        //new value of name
        name.toUpperCase();
        System.out.println(name);
        // this will show "Test Automation" as result because the new upper case Strings hasn't
        //assigned to new variable .when we will assign this to new Variable and print in it will show.
        String TestResult= name.toUpperCase();
        System.out.println(TestResult);

    }
}
