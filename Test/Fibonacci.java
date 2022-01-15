package Test;

import java.io.*;

public class Fibonacci{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(b.readLine());

        int a=1,c=2,d=0;
        for(int i=0;i<n;i++)
        {
                System.out.print(a+" ");
                d=a+c;
                a=c;
                c=d;
        }
    }
}
