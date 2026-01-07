package ex_16_Task;
//find the maximum of two numbers using the ternary operator.
public class maxOfTwoNumbers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String result=  a>b? "Maximum number is"+" "+a :"Maximum number is"+" "+b;
        System.out.println(result);
    }
}
