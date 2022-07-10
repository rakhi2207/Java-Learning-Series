package Pepcoding;

import java.util.Scanner;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int ele= scan.nextInt();
        System.out.println(getAns(arr,0,ele));
    }

    public static boolean getAns(int[] arr,int idx,int ele)
    {
        if(idx==arr.length)
        {
            return false;
        }
        boolean bool=getAns(arr,idx+1,ele);
        if(bool||arr[idx]==ele)
        {
            return true;
        }
        return false;
    }
}
