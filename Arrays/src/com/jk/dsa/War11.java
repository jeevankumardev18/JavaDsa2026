package com.jk.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class War11
{
    public static void main(String args[])
    {
        int[] arr={3,-4,-2,1,7,18,-43,-7};
        MoveNegativesToBeginning(arr);
        System.out.println("=============");
        MoveNegativesToEnd(arr);
    }

    public static void MoveNegativesToBeginning(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public  static void MoveNegativesToEnd(int[] arr)
    {
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}

