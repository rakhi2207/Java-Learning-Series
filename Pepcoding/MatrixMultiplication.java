package Pepcoding;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int column=scan.nextInt();
        int[][] arr=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }


        int row1=scan.nextInt();
        int column1=scan.nextInt();
        int[][] arr1=new int[row1][column1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<column1;j++)
            {
                arr1[i][j]=scan.nextInt();
            }
        }

        int[][] mux=new int[row][column1];

        for(int k=0;k<row;k++)
        {
            for(int i=0;i<column1;i++)
            {
                for(int j=0;j<column;j++)
                {
                    mux[k][i]+=arr[k][j]*arr1[j][i];
                }
            }
        }

         for(int i=0;i<row;i++)
         {
             for(int j=0;j<column1;j++)
             {
                 System.out.print(mux[i][j]+" ");
             }
             System.out.println();
         }

    }
}
