package Pepcoding;

import java.util.ArrayList;

//Multiplication with single digit of any base
public class Multiplication {

    public static int multiply(int n,int b,int m)
    {
        int val=0;
        int carry=0;
        int p=1;
        while(n>0||carry>0)
        {
            int a=n%10;
            n=n/10;
            int ans=a*m+carry;
            carry=ans/b;
            int c=ans%b;
            val+=c*p;
            p=p*10;
        }
        return val;
    }

    public static int add(int n1,int n2,int b)
    {
        int carry=0;
        int val=0;
        int p=1;
        while(n1>0||n2>0||carry>0)
        {
            int a=n1%10;
            int n=n2%10;
            n1=n1/10;
            n2=n2/10;
            int ans=a+n+carry;
            carry=ans/b;
            val+=(ans%b)*p;
            p=p*10;
        }
        return val;
    }
    public static void main(String[] args) {
        int rv=1;
        int n1=100,n2=99,b=8;
        int ans=0;
        while(n2>0)
        {
            int a=n2%10;
            n2=n2/10;
            int val=multiply(n1,b,a);
            ans=add(ans,val*rv,b);
            rv=rv*10;
        }
        System.out.println(ans);
    }
}
