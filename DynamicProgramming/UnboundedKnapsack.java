package DynamicProgramming;

import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] values=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++)
        {
            values[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            weight[i]= scan.nextInt();
        }
        int cap= scan.nextInt();
        int[] dp=new int[cap+1];
        dp[0]=0;
        for(int i=1;i<=cap;i++)
        {
            int val=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                if(i>=weight[j]) {
                    val=Math.max(val,values[j]+dp[i-weight[j]]);
                }
            }
            dp[i]=val;
        }
        int ans=Integer.MIN_VALUE;
        for(int i:dp)
        {
           ans=Math.max(ans,i);
        }
        System.out.println(ans);

    }
}
