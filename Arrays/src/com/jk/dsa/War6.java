package com.jk.dsa;

public class War6
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        EvenOddCount(arr);
        System.out.println("=========================");
        EvenOddCountThroughBitManipulation(arr);
    }
    public  static void EvenOddCount(int[] arr)
    {
        int evenCount=0;
        int oddCount=0;

        for(int num:arr){

            if (num%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Even Count is: "+evenCount);
        System.out.println("Odd Count is: "+oddCount);

    }

    public static void EvenOddCountThroughBitManipulation(int[] arr)
    {
        int evenCount=0;
        int oddCount=0;

        for(int num:arr) {
           if((num & 1)==0)   //use bitwise & operator... if == 0 it is even , if == 1 it is odd.
            {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Even Count is: "+evenCount);
        System.out.println("Odd Count is: "+oddCount);
    }



}
