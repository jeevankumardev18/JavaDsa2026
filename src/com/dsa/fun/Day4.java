package com.dsa.fun;

//4.Sum of All Elements
public class Day4
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println(ArraySum(arr));
    }
    public static int ArraySum(int[] arr)
    {
        if(arr==null) return 0;
        int sum=0;
        for(int num:arr)
        {
            sum=sum+num;
        }
        return sum;

    }

}
