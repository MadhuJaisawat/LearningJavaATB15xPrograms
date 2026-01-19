package ex_18_Arrays;

public class Array_1 {
    public static void main(String[] args) {
        //str.lenght() -is a function  and class while arr.lenght is a property,nota class
        //stores same types of data,fixed in size
        //delete & add are heavy operation that's why we use arrays list or collection framework
        String[]  names = {"kavita","mahak","Priya"};
        int marks [] = {5,8,9,9,10};
        //int [] marks = {1,4,7,10,9};
      //  int arr[] = {1,3,5,test,do);// not allowed
        float values[]= new float[4];
        values[0]=3.14f;
        values[1]=2.14f;
        values[2]=1.67f;
        values[3]= 5.30f;
        for(String name:names){
            System.out.println(name);
        }



    }
}
