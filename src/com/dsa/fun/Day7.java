package com.dsa.fun;
//7)Check if Array is Sorted
public class Day7
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println( isSorted(arr));
    }
    public static boolean isSorted(int[] arr)
    {
        for(int i=1;i< arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return  true;

    }

}
