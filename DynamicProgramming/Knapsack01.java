package DynamicProgramming;

import java.util.Scanner;

public class Knapsack01 {
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
        int[][] dp=new int[n+1][cap+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=cap;j++)
            {
                if(j<weight[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }else {
                    int val = Math.max(dp[i - 1][j], (values[i - 1] + dp[i-1][j-weight[i-1]]));
                    dp[i][j]=val;
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
