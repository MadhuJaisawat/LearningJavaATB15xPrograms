package ex_07_IncreDecreeOperator;

public class Task_26Dec2 {
    public static void main(String[] args) {
        int a = 3;
        //int b = a++ * ++a;
        int A = a++;
        int B = ++a;
        int b = A* B;

        //lineno /a /A/B
        //7/4 |3|NA
        //8|5|5
        System.out.println(b);
        System.out.println(a);



    }
}
