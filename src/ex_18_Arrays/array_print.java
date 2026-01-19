package ex_18_Arrays;

public class array_print {
    public static void main(String[] args) {
        int marks [] = {1,3,5,7,9};
        System.out.println(marks.length);

        for (int mark:marks){
            System.out.println(mark);
        }
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
