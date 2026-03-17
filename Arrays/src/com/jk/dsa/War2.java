package com.jk.dsa;

public class War2
{
    public static void main(String[] args)
    {
       int[] arr={1,2,3,4,5};
        System.out.println(findSmallest(arr));
    }
    public static int findSmallest(int[] arr)
    {
        if(arr == null || arr.length==0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int smallest=Integer.MAX_VALUE;
        for(int num:arr)
        {
            if(num<smallest)
            {
                smallest=num;
            }
        }
        return smallest;
    }

}

