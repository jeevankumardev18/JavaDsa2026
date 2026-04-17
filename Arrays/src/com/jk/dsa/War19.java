package com.jk.dsa;

//Best Time to Buy and Sell Stock ---> Track minimum price so far and calculate profit
public class War19
{
    public static void main(String[] args)
    {
        int[] arr ={7,1,5,3,6,4};
        maxProfit(arr);
    }

    public static void maxProfit(int[] arr)
    {
        int minPrice=arr[0];
        int profit=0;
        for(int price:arr)
        {
            if(price < minPrice)
            {
                minPrice =price;
            }
            else
            {
                profit=Math.max(profit,price-minPrice );
            }
        }
        System.out.println(profit);
    }

}
