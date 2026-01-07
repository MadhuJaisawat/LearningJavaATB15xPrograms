package ex_14_Functions;

public class ex3_ReturnTypeFunction {
    public static void main(String [] args ) {
        non_return_type();
        String response = return_type_function();
        System.out.println(response);

    }

    static void non_return_type(){
        System.out.println(" This will not return anything");
    }
    static String return_type_function(){
        System.out.println("this will return");
        return "anything";
        //datatype should be matched ```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
    }
}
