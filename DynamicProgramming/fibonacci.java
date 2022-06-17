package DynamicProgramming;

import java.util.Scanner;

public class fibonacci {
    public static int fib(int n,int[] arr)
    {
        if(n==0||n==1)
        {
            return n;
        }
        if(arr[n]!=0)
        {
            return arr[n];
        }
        System.out.println("Hello "+n);
        int f1=fib(n-1,arr);
        int f2=fib(n-2,arr);
        int ans=f1+f2;
        arr[n]=ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ans=new int[n+1];
        System.out.println(fib(n,ans));
    }
}
