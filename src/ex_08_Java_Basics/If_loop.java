package ex_08_Java_Basics;

public class If_loop {
    public static void main(String [] args) {
        System.out.println("Enter the age into CLI options\n");
        int age = Integer.parseInt(args[0]);
        if (age>18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can't vote");
        }

    }
}
