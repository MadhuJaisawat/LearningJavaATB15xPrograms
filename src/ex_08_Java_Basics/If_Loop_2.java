package ex_08_Java_Basics;

public class If_Loop_2 {
    public static void main(String[] args) {
        //int age = 12;
        int age = Integer.parseInt(args[0]);
        if (age>18) {
            System.out.println(" you can go to Goa");
        } else {
            System.out.println(" you can't");
        }
    }
}
