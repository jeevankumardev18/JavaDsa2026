package com.dsa.fun;
//1.Find the Largest Element in an Array
public class Day1
{
    public static void main(String[] args)
    {
      int[] arr={1,3,4,6,9};
       int res= findLargest(arr);
        System.out.println("Largest Element is: "+res);
    }

    public static int findLargest(int[] arr)
    {
        if(arr.length==0)
        {
            throw  new IllegalArgumentException("Array is Empty");
        }
        int max=arr[0];
        for(int num:arr)
        {
            if(num>max)
            {
                max=num;
            }

        }
        return max;
    }


}
