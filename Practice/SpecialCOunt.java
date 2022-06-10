package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpecialCOunt {

    public static int gcd(int a,int b)
    {
        if(a==0)
            return b;

        return gcd(b%a,a);
    }

    public static int fact(int pow,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n%2!=0)
        {
            return pow*fact(pow*pow,n/2);
        }

        return fact(pow*pow,n/2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }

        int max=0;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        //System.out.println(max);

        ArrayList<Integer> a=new ArrayList<>();
        for(int i=2;i<10;i++)
        {
            a.add(i);
        }
        int val=0,pro=1;
        for(int i=20;i<=max;i++)
        {
            int ci=i;
            while(ci>0)
            {
                int x=ci%10;
                //System.out.println("X changes"+x);
                pro*=x;
                ci=ci/10;

                val+=fact(x,4);
            }
            if(gcd(pro,val)>1)
                a.add(i);
            val=0;
            pro=1;
        }

        //System.out.println(a);
        for(int i:arr)
        {
            int count=0;
            for(int j:a)
            {
                if(j<=i)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
