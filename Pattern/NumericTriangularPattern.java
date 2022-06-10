package Pattern;

import java.util.Scanner;

public class NumericTriangularPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
                int n=scan.nextInt();
                int space=n-1;
                for(int i=0;i<n;i++)
                {
                    int val=2+i;
                    boolean check=false;
                    for(int j=0;j<=(n-1)+i;j++)
                    {
                        if(j<space)
                        {
                            System.out.print(" ");
                        }else
                        {
                            if(val>=2&&!check)
                            {
                                val--;
                                System.out.print(val);
                            }else
                            {
                                check=true;
                                val++;
                                System.out.print(val);
                            }
                        }
                    }
                    space--;
                    System.out.println();
                }
    }
}
