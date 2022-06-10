package Pepcoding;

import java.util.Scanner;

public class VandanaQue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] A=new int[n];
        A[2]=010;
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

