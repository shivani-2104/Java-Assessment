package com.company.Day6.Assesment;

public class Fibonacci {
    static void fibonacciIterative(int n)
    {
        int a=-1,b=1,c,i=0;
        while(i<=n)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            i++;
        }
    }
   static int a=-1,b=1,c;
    static void fibonacciRecursive(int n)
    {

       if(n<0)return;
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        fibonacciRecursive(n-1);
    }
    public static void main(String ar[])
    {
        int n=8;
        fibonacciIterative(n);
        System.out.println();
        fibonacciRecursive(n);
    }

}
