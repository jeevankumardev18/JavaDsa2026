package com.jk.dsa;

import java.util.Arrays;

//Q)Remove Duplicates from Sorted Array
public class War8
{
    public static void main(String[] args)
    {
       int[] arr={1,1,2,2,3,4};
       int k=removeDuplicates(arr);
        System.out.println("Unique Count: "+k);

        System.out.println("Array: "+Arrays.toString(Arrays.copyOf(arr,k)));
    }

    public static int removeDuplicates(int[] arr)
    {
       int j=0;
       for(int i=1;i< arr.length;i++)
       {
           if(arr[i]!=arr[j])
           {
               j++;
               arr[j]=arr[i];
           }
       }
       return j+1;

    }
}
