package com.jk.dsa;
//Rotate Right K times
import java.util.Arrays;

public class War15
{
    public static void main(String[] args)
    {
       int[] arr={1,2,3,4,5,6,7,8};
       int k=2;
       k=k%arr.length;
       Reverse(arr,0,arr.length-1);
       Reverse(arr,0,k-1);
      //Reverse(arr,k, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void Reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }


}
