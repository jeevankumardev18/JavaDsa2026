package com.dsa.fun;
//12)Check the number is Palindrome or not.
public class Day12 {
    public static void main(String[] args)
    {
        int n=101;
       int res= isPalindrome(n);
        System.out.println(n==res ? "Palindrome" : "Not-Palindrome");
    }

    private static int isPalindrome(int n)
    {

        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
