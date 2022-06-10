package Doubt;

import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i+=2)
        {
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println("Sum is "+sum);
    }
}
