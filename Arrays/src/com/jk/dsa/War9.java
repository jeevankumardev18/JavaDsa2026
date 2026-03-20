package com.jk.dsa;

import java.util.Arrays;

public class War9
{
    public static void main(String[] args) {
        int[] arr={0,1,0,3,0,2};
        moveZerosToEnd(arr);
        System.out.println("------------------");
        moveZerosToBeginning(arr);
    }
    public static void moveZerosToEnd(int[] arr)
    {
        int j=0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i]!=0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToBeginning(int[] arr)
    {
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


