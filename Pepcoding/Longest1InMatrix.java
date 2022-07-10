package Pepcoding;

import java.util.Scanner;

public class Longest1InMatrix {
    static int l1=Integer.MIN_VALUE;
    public static void getAns(int r,int c,int[][] arr,boolean[][] visited,int count)
    {
        if(r<0||c<0||r>=arr.length||c>=arr[0].length||arr[r][c]==-1||visited[r][c])
        {
            l1=Math.max(l1,count);
            return ;
        }
        visited[r][c]=true;
        if(arr[r][c]==1) {
            count = count + 1;
        }
        if(r%2!=0) {
            getAns(r, c - 1, arr, visited, count);
        }else
        {
            getAns(r, c +1, arr, visited, count);
        }
        getAns(r + 1, c, arr, visited, count);
        visited[r][c]=false;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= scan.nextInt();
            }
        }
        boolean[][] visited=new boolean[n][m];
        getAns(0,0,arr,visited,0);
        System.out.println(l1);
    }
}
