package ex_18_Arrays;

import java.util.Arrays;

public class secondHighestinArray {
    public static void main(String[] args) {
        int num[]={4,6,8,10,9};
        //Arrays.sort(num);
        //System.out.println(num[num.length-2]);
        int highest=num[0];
        int secondHighest=num[0];
        for(int i =1;i<num.length;i++){
            if(num[i]>highest){
                secondHighest=highest;
                highest=num[i];

            } else if (num[i]>secondHighest && num[i] !=highest){
                secondHighest=num[i];

            }

            }
        System.out.println("secondHighest:"+ secondHighest);


        }
    }

