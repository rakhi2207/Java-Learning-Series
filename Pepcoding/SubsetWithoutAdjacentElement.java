package Pepcoding;

import java.util.Scanner;

public class SubsetWithoutAdjacentElement {
    static int max=Integer.MIN_VALUE;
    public static void getSubsequence(int[] arr,int idx,String subset,boolean occur,int sos)
    {
        if(idx==arr.length)
        {
            System.out.println(subset);
           if(sos>max)
           {
              // System.out.println(subset);
               max=sos;
           }
            return ;
        }
        if(occur)
        {
            getSubsequence(arr,idx+1,subset+arr[idx],false,sos+arr[idx]);
            getSubsequence(arr,idx+1,subset,true,sos);
        }else
        {
            getSubsequence(arr,idx+1,subset,true,sos);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }

        getSubsequence(arr,0,"",true,0);
        System.out.println(max);
    }
}
