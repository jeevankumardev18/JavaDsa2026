package com.jk.dsa;

import java.util.Arrays;

public class War17
{
    public static void main(String[] args)
    {
        int[] arr={-4,-1,0,3,10};
        int[] res=SortedSquares(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] SortedSquares(int[] arr)
    {
        int n=arr.length;
        int[] res=new int[n];

        int left=0;
        int right=n-1;
        int index=n-1;

        while(left<=right)
        {
            int leftSquare=arr[left]*arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare > rightSquare){
                res[index--]=leftSquare;
                left++;
            }
            else {
                res[index--]=rightSquare;
                right--;
            }
        }
        return res;
    }

}
