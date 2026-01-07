package ex_16_Task;
//print all even numbers between 1 and 50 using a do-while loop.
public class doWhile_11 {
    public static void main(String[] args) {
        int num=1;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        } while(num<=50);
    }
}
