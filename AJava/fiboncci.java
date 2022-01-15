package AJava;

import java.util.Scanner;

public class fiboncci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,c=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
