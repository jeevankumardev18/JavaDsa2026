package com.jk.dsa;

public class War1
{
    public static void main(String[] args)
    {
        int[] arr={12,15,23,88,183};
        System.out.println(findLargest(arr));
    }
    public static int findLargest(int[] arr)
    {
        if(arr == null || arr.length==0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int largest=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>largest)
            {
                largest=num;
            }
        }
        return largest;
    }

}
