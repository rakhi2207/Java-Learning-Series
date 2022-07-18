package Pepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;

public class TrappingRainWater {
    public static int trap(int[] height) {
     int[] rg=new int[height.length];
     int max=height[0];
     rg[0]=height[0];
     for(int i=1;i< height.length;i++)
     {
         max=Math.max(max,height[i]);
         rg[i]=max;
     }
     max=height[height.length-1];
     rg[height.length-1]=height[height.length-1];
        for(int i= height.length-1;i>=0;i--)
        {
            max=Math.max(max,height[i]);
            rg[i]=Math.min(rg[i],max);
        }
//        for(int i:rg)
//        {
//            System.out.println(i);
//        }
       int ans=0;
        for(int i=0;i< height.length;i++)
        {
            ans+=rg[i]-height[i];
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i] = Integer.parseInt(read.readLine());
        int result = trap(arr);
        System.out.println(result);

    }
}
