package com.jk.dsa;

import java.util.Arrays;

//Product of Array Except Self
public class War20
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        ProductExceptSelf(arr);
    }

    public static void ProductExceptSelf(int[] arr)
    {
        int n=arr.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]*arr[i-1];
        }
        int suffix =1;
        for(int i=n-1;i>=0;i--)
        {
            res[i]=res[i]*suffix;
            suffix=suffix*arr[i];
        }

        System.out.println(Arrays.toString(res));
    }

}
