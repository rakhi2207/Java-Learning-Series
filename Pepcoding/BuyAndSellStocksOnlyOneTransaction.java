package Pepcoding;
import java.util.*;
public class BuyAndSellStocksOnlyOneTransaction {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int min=arr[0],max=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>min)
            {
                max=Math.max(max,arr[i]-min);
            }
            min=Math.min(min,arr[i]);
        }

        System.out.println(max);
    }
}
