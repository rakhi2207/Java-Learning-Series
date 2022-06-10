package Pepcoding;

import java.util.Scanner;

public class DPFibonacci {

    public static int fibonaci(int n,int[] arr)
    {
        if(n==0||n==1)
        {
            return n;
        }

        if(arr[n]!=0)
            return arr[n];

        int fib1=fibonaci(n-1,arr);
        int fib2=fibonaci(n-2,arr);
        int fib=fib1+fib2;

        arr[n]=fib;

        return fib;
    }
    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n+1];
        System.out.println(fibonaci(n,arr));

    }
}
