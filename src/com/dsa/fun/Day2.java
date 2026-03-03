package com.dsa.fun;
//2.Find the Smallest Element in an Array
public class Day2
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println("Smallest Element is: "+findSmallest(arr));
    }
    public static int findSmallest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = arr[0];
       for(int num:arr)
       {
           if(num<min)
           {
               min=num;
           }
       }
        return min;

    }


}
