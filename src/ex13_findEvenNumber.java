public class ex13_findEvenNumber {
    public static void main(String[] args) {
        for (int i = 0; i<=40 ; i++) {
            if (i%2 !=0) {
                continue;
                // as continue is for skipping so if we use ==then it will skip even numbers
            }
            System.out.println(i);
        }
    }
}
