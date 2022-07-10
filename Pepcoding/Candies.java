package Pepcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Candies {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            String[] s=br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            for(int i=1;i<n;i++)
            {
                arr[i]=arr[i]+arr[i-1];
            }
            int sum=0;
            for(int i=1;i<n;i++)
            {
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
