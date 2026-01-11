package Practice_Ques;

public class practice_1 {
    public static void main(String[] args){
        int i = 5;
        //int j = i++ + ++i;
        //line no |i |j
        //5|5|NA

        int a =i++;
        int b=++i;
        int j= a +b;
        //a=5 & i =6
        //b = 7 & i=7
        //6|
        System.out.println("i: " + i + ", j: " + j);


    }
}
