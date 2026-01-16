package ex_17_Strings;

public class String2_newOperator {
    public static void main(String[] args){
        String S1= "Test";//SCP- String Constant Pool
        String S2= new String("test1"); //in new Object area
        System.out.println(S2);
        System.out.println(S1);

    }
}
