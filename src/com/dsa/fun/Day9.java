package com.dsa.fun;

import java.util.Arrays;

//9)Rotate Array Left by One
public class Day9
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr)
    {
        int first=arr[0];
        for(int i=1;i< arr.length;i++) {
          arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
    }

}
