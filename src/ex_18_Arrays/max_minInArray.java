package ex_18_Arrays;

import java.util.Arrays;

public class max_minInArray {
    public static void main(String[] args) {
        int [] arr={23,67,89,90,12,45,32};
       // Arrays.sort(arr);
       // System.out.println(arr[arr.length-1]);
        int max= arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println(max);
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
