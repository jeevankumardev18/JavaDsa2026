package com.jk.dsa;

public class War7
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        findSumAndAverage(arr);
    }

    public static void findSumAndAverage(int [] arr)
    {
      int sum=0;

      for(int num:arr)
      {
          sum=sum+num;
      }

      double average=(double) sum/ arr.length;

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);

    }

}
