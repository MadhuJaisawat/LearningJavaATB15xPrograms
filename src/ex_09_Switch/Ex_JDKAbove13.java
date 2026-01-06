package ex_09_Switch;

public class Ex_JDKAbove13 {
    public static void main(String[] args) {
        //for JDK>13
        int a = 10;
        switch (a) {
            case 10 -> System.out.println("10");
            //it will execute this line and break is included in that
            case 11-> System.out.println("11");
            case 9 -> System.out.println("9");
            default -> System.out.println("invalid");
        }
    }
}
