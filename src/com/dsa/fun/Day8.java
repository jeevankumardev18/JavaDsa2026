package com.dsa.fun;

//8)Remove Duplicates from Sorted Array
import java.util.Arrays;

public class Day8
{
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3};
       int[] res=removeDuplicates(arr);
        System.out.println(Arrays.toString(res));

    }
    public static int[] removeDuplicates(int[] arr)
    {
        if (arr.length==0) return new int[0];
        int i=0;
        for(int j=1;j< arr.length;j++) {
            if(arr[j]!=arr[i]) {
                i++;
                arr[i]=arr[j];
            }
        }
        return Arrays.copyOf(arr,i+1);

    }

}
