package ex_10_ForLoop;

public class ex11_odd_even {
    public static void main(String[] args) {
        // to find the even number from 1 to 50
        for (int i =1 ; i <= 50 ; i++) {
            if ( i%2 == 0) {
                System.out.println(" This is even number" + i);
            //} else {
                //System.out.println( " This is odd number" + i);
                // or if we want to print odd number then i%2 != 0
            }
        }
    }
}
