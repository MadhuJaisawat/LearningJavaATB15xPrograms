package ex_04_operators;

public class InterviewQ_Concat {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println(a+b);
        //String -> concatenation
        String first_word = "help";
        String second_word = "Full";
        String final_word = "first_word"+"second_word";
        System.out.println(final_word);
        System.out.println(first_word+second_word);
        //in case of string only joining (+) is allowed , -,/,* are not allowed
// String -> + for concatenation
        //integer -> + for addition
    }
}
