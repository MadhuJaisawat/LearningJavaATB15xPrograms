package ex_14_Functions;

public class ex6_allfunctions {
    public static void main(String[] args) {
        withP_withoutReturn(5);
        String res = No_parameter_withReturn();
        System.out.println(res);
        String return_String = withparameter_withReturn( "First", "second");
        System.out.println(return_String);

    }

    //(1) without parameter and without return
    static void no_parameter_noReturn() {
        System.out.println("this will not return");
    }

    //(2) without parameter and with return
    static String No_parameter_withReturn() {
        System.out.println("This will return");
        return "Test";
    }

    //(3) with parameter and without return
    static void withP_withoutReturn(int a) {
        System.out.println(" This will print " + a);

    }

    //with parameter and with return
    static String withparameter_withReturn(String a, String b) {
        System.out.println(" This will return String ");
        return "pass";
    }
}

