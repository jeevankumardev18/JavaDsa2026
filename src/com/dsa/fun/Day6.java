package com.dsa.fun;
//6)Second Largest Element
public class Day6
{
    public static void main(String[] args)
    {
        int[] arr={5,8,4,9,3};
        System.out.println("Second Largest Elemet is: "+ findSecondLargest(arr));
    }
    public  static int findSecondLargest(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr) {
            if(num>largest) {
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;
            }
        }
        return secondLargest;
    }

}
