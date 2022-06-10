package Pepcoding;

import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int len=(int)Math.pow(2,n);
        int i=0;

        int[] val=new int[n];

        while(i<len)
        {
            int value=i;
            int ind=0;
            int pos=n-1;
            while(value>0)
            {
                val[pos]=value%2;
                value=value/2;
                pos--;
            }

            for(int x:val)
            {
                if(x==0)
                {
                    System.out.print("- ");
                }else
                {
                    System.out.print(arr[ind]+" ");
                }
                ind++;
            }
            System.out.println();
            i++;
        }
    }
}
