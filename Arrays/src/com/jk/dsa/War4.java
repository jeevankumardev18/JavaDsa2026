package com.jk.dsa;

public class War4
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        checkArraySorted(arr);
    }
    public  static void checkArraySorted(int[] arr)
    {
      boolean sorted=true;
      for(int i=0;i<arr.length-1;i++) {
          if(arr[i]>arr[i+1] ) {
              sorted = false;
              break;
          }
      }
        System.out.println(sorted);
    }


}
