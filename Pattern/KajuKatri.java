package Pattern;

import java.util.Scanner;

public class KajuKatri {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n/2+1;i++)
        {
            for(int j=0;j<n-i-2;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n/2-1;i>=0;i--)
        {
            for(int j=0;j<n-i-2;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
