package Practice;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] arr=new int[n][n];
        int count=n-1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= scan.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int ans=i;
            for(int j=0;j<=count;j++)
            {
                    System.out.println(arr[j][ans]);
                    ans++;
            }
            count--;
        }


    }
}
