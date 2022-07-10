package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class pattern_official_132 {
    public static boolean getAns(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        int[] pm=new int[arr.length];
        int min=arr[0];
        pm[0]=min;
        for(int i=1;i<arr.length;i++)
        {
            pm[i]=Math.min(min,arr[i]);
        }

        return true;
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println(getAns(arr));
    }
}
