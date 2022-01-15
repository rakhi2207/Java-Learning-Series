package Pepcoding;

import java.util.Scanner;

public class TheStateOfWakanda_1 {
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

        int col=0;

        while(col<column)
        {
            int ro=0;
            while(ro<row)
            {
                System.out.println(arr[ro][col]);
                ro++;
            }
            col++;

        }
    }
}
