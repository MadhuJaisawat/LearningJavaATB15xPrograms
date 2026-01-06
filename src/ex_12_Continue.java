public class ex_12_Continue {
    public static void main(String[] args) {
        for (int i = 0 ; i <20 ; i++) {
            if (i ==6) {
                //from i =0 to5 it will not in the  loop it will print i value
                // when i is 6 then it will continue to next number means6 will be skipped
                continue;
            }
            System.out.println(i);
        }
    }
}
