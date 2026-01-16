package ex_17_Strings;

public class String_Interview2 {
    public static void main(String[] args){
        String a= "Hello";
        String b ="Hello";
        String c="Hello";
        String d="hello";
        //SCP -2 Strings - a,b ,c will be pointing out to same string but d will be different
        String test= new String("Hello");
        String test1=new String("Hello");
        String test2=new String ("Hello");
        //in case of new it will create new object every time

        //comparison of Strings
        System.out.println(a==b); //both are pointing into same SCP
        System.out.println(a==test);
        System.out.println(c==test2);
        System.out.println(test1==test2); //both are in new object area
        //equals to we use for checking the value is sameor not
        System.out.println(a.equals(test));
        System.out.println(a.equals(d));
        System.out.println(a.equals(test2));
        //equalIgnoreCase for ignoring the lettercase
        System.out.println(a.equalsIgnoreCase(d));

    }

}
