package com.jk.dsa;

import java.util.Arrays;

public class War13
{
    public static void main(String[] args)
    {
        int[] arr={3,2,1,5,6,4};
        int k=3;
        findKthLargest(arr,k);
    }
    public static void findKthLargest(int[] arr,int k)
    {
        if(k<=0 || k > arr.length )
        {
            System.out.println("Invalid K");
            return;
        }
        Arrays.sort(arr);
        int res=arr[arr.length-k];
        System.out.println(res);
    }

}
