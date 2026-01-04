package ex_07_IncreDecreeOperator;

public class PreOperator {
    public static  void main(String[] args) {
        int a = 10;
        int b = ++a;
        //int b = a++;
        System.out.println(a);
        System.out.println(b);
        //++a-> a= a+1
        //Expression Result Table
        //line no |a|Result b
        //5|10| NA
        //6|11|11
        //7|

    }
}
