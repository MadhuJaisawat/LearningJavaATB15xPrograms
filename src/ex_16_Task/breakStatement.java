package ex_16_Task;
//print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement
public class breakStatement {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
