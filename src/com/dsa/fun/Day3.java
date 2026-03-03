package com.dsa.fun;
//3.Reverse an Array
import java.util.Arrays;

public class Day3
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr)
    {
        if (arr==null) return;

        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

}
