package ex_09_Switch;

public class Ex2_JDKAbove13 {
    public static void main(String[] args) {
        int a = 20;
        switch(a) {
            case 20 , 21, 22 -> System.out.println("Matching");
            case 10,11,12-> System.out.println("No Matching");
            default -> System.out.println("none");
        }
    }
}
