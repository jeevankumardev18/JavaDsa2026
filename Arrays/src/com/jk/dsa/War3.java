package com.jk.dsa;

public class War3
{
    public static void main(String[] args)
    {
        int[] arr={82,100,183,155,61};
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondSmallest(arr));
    }

    public static int findSecondLargest(int[] arr)
    {
        if(arr == null || arr.length==0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr) {
            if(num>largest) {
                secondLargest=largest;
                largest=num;
            }
            else if (num>secondLargest && num !=largest) {
                secondLargest=num;
            }
        }
        return secondLargest;
    }

    public static int findSecondSmallest(int[] arr)
    {
        if(arr == null || arr.length==0)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int num:arr) {
            if(num<smallest) {
                secondSmallest=smallest;
                smallest=num;
            } else if (num<secondSmallest && num!=smallest) {

                secondSmallest=num;
            }
        }
        return secondSmallest;
    }


}

