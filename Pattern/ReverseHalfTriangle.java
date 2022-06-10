package Pattern;

import java.util.Scanner;

public class ReverseHalfTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int val=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<val)
                {
                    System.out.print(" ");
                }else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
            val--;
        }
    }
}
