package ex_17_Strings;

public class String_Imm {
    public static void main(String[] args){
        String s1= "Test";
        s1=s1.concat("mine");
        System.out.println(s1);
        //SCP = 2 Strings one is Test and another one is Testmine
    }
}
