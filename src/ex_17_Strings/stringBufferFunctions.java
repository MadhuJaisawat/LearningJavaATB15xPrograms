package ex_17_Strings;

public class stringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer s0=new StringBuffer("dummy");
        s0.append("Test");
        System.out.println(s0);
        //here this will become only one string that's why we use StringBuffer
        String S1= "dummy";
        S1=S1+"Test";
        //this will not be used as these are become 2 Strings
        System.out.println(S1);
    }
}
