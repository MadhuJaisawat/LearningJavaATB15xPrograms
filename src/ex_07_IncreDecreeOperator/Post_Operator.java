package ex_07_IncreDecreeOperator;

public class Post_Operator {
    public static void main(String[] args) {
        int a =10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        //ERT
        // line no|a |b
        //5|10|NA
        //6|11|10  //first it will assign the value to b then increment

    }
}
