package com.dsa.fun;
//11)Check if number is prime or not
public class Day11
{
    public static void main(String[] args) {
        int n = 5;
        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Non-Prime");
        }
    }



}
