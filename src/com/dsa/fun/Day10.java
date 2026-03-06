package com.dsa.fun;
//10)Move Zeros to End
import java.util.Arrays;

public class Day10
{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEnd(int[] arr) {

       int index=0;
       for(int i=0;i< arr.length;i++){
           if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[index];
               arr[index]=temp;
               index++;
           }
       }
    }



}
