package ex_17_Strings;

public class stringBuffer {
    public static void main(String[] args) {
        //90% time we will be using NewString
        String s1="dummy";
        String s2= new String("dummy");

        //10% time we will be using String buffer & builder
        StringBuilder S3= new StringBuilder("dummy");// they are in String object area when we use new
        StringBuffer s4= new StringBuffer("dummy");
        //both have inbuilt reverse function
        System.out.println(S3.reverse());
        System.out.println(s4.reverse());


    }
}
