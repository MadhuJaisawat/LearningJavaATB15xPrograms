package ex_16_Task;
//check whether a given number is positive, negative, or zero using the ternary operator.
public class checkNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        String result= (num==0)?"number is zero":((num>0)?"Positive number":"Negative number");
        System.out.println(result);


    }
}
