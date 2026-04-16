package com.jk.dsa;
//Q)Pair With Given Sum (Two Sum – Sorted Array)
public class War10
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,6};
        int target = 6;
        pairSum(arr,target);
    }
    public static void pairSum(int[] arr,int target)
    {

        int left=0;
        int right=arr.length-1;
        boolean found = false;
        while(left<right){
           int sum= arr[left]+arr[right];
           if(sum==target){
               System.out.println(arr[left]+" "+arr[right]);
               found = true;
               break;
           } else if (sum<target) {
               left++;
           }
           else {
               right--;
           }
        }
        if(!found){
            System.out.println("No Pair Found");
        }

    }

}
