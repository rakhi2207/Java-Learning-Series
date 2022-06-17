package Pepcoding;

import java.io.*;
import java.util.*;

public class PartitionIntoSubset {

    public static long partitionKSubset(int n, int k) {
        // write your code here
        if(k==0)
        {
            return 0;
        }
        long[][] help=new long[k+1][n+1];
        for(int i=1;i<=n;i++)
        {
            help[1][i]=1;
        }

        for(int i=2;i<=k;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i>j)
                {
                    help[i][j]=0;
                }else if(i==j)
                {
                    help[i][j]=1;
                }else
                {
                    help[i][j]=i*help[i][j-1]+help[i-1][j-1];
                    System.out.println(help[i][j]);
                }
            }
        }

        for(int i=0;i<=k;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(help[i][j]);
            }
            System.out.println();
        }

        return help[k][n];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}