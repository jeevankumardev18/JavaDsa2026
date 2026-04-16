package com.jk.dsa;

import java.util.Arrays;

public class War12
{
    public static void main(String[] args)
    {
        int[] arr1={1,3,5};
        int[] arr2={2,4,6};
        int[] res=new int[arr1.length+arr2.length];
         mergeTwoSortedArrays(arr1,arr2,res);

    }
    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2,int[] res)
    {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                res[k++]=arr1[i++];
            } else {
                res[k++]=arr2[j++];
            }
        }
        while (i<arr1.length)
        {
            res[k++]=arr1[i++];
        }
        while (j<arr2.length)
        {
            res[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(res));
    }

}
