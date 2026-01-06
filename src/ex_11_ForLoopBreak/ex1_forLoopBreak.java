package ex_11_ForLoopBreak;

public class ex1_forLoopBreak {
    public static void main(String[] args) {
        for (int i =0;i <50; i++) {
            //System.out.println(i);
            // first we are printing then executing from the loop
            if (i==7) {
                break;
            }
            System.out.println(i);
            // here we are executing first & then printing
            // break only allowed in for or switch
        }
    }
}
