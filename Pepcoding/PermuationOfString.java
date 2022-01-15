package Pepcoding;

import java.util.Scanner;

public class PermuationOfString {

    public static int factorial(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void solution(String str){
        // write your code here
        int n=str.length();
        int fact=factorial(n);

        for(int i=0;i<fact;i++)
        {
            int temp=i;
            StringBuilder s=new StringBuilder(str);
            for(int j=n;j>0;j--)
            {
                int q=temp%j;
                temp=temp/j;
                System.out.print(s.charAt(q));
                s.deleteCharAt(q);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
