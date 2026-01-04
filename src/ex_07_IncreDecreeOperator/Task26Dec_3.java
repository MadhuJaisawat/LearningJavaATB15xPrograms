package ex_07_IncreDecreeOperator;

public class Task26Dec_3 {
    public static void main(String[] args) {
        int a = 5;
        int A = a++;
        int B = a--;
        //ERT
        //line no |a|A|B
        //6|6|5|NA
        //7|5|NA|6
        System.out.println(A+ B);
        System.out.println(a);

    }
}
