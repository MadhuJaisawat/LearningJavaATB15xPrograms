package ex_04_operators;

public class InterviewQ_4 {
    public static void main(String[] args) {
        int a = 10;
        boolean b = !(a<5||a>5);
        System.out.println(b);
        //divide and conquer
        //A->10<5 -> false
        //B->10>5-> true
        //A||B ->false||true->false

    }
}
