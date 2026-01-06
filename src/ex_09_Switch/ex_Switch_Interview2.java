package ex_09_Switch;

public class ex_Switch_Interview2 {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch) {
            case 65:
                System.out.println("This will Match ASCII");
                //Char are nothing but integers only
                break;
            default:
                System.out.println("No match");
                break;

        }
        System.out.println("End Of Progm");
    }
}
