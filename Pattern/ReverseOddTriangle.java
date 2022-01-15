package Pattern;

import java.util.Scanner;

public class ReverseOddTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int x=(n-1)*2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=x-i;j++)
            {
                if(i>j)
                {
                    System.out.print(" ");
                }else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
