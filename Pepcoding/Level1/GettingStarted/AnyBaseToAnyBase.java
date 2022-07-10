package Pepcoding.Level1.GettingStarted;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static Integer getBinary(int s,int div)
    {
        Integer i=0;
        int mul=1;
        while(s>0)
        {
            int x=s%10;
            s=s/10;
            if(x!=0)
            {
                i+=x*mul;
            }
            mul=mul*div;
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        Integer con=getBinary(n, sourceBase);
       int count=0,mul=1;
       while (con>0)
       {
           int val=con%destBase;
           con=con/destBase;
           count=val*mul+count;
           mul=mul*10;
       }
        System.out.println(count);
    }
}
