package Doubt;

import java.util.Arrays;
import java.util.Scanner;

public class KlargestSmallest {
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
        Arrays.sort(arr);
        System.out.println("Enter the value of k for largest element");
        int k= scan.nextInt();
        int sm=n,la=0;
        while(k-->0)
        {
            la++;
        }
        System.out.println("Enter the value of k for smallest element");
        int j= scan.nextInt();
        while(j-->0)
        {
            sm--;
        }
        System.out.println("largest "+arr[la]);
        System.out.println("Smallest "+arr[sm]);
    }
}
