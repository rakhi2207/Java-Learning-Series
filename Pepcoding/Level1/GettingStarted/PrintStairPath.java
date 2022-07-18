package Pepcoding.Level1.GettingStarted;

import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int val=scan.nextInt();
        printStairPaths(val,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n==0)
        {
            System.out.println(path);
        }
        if(n<0)
        {
            return ;
        }
        printStairPaths(n-1,path+"1");
        printStairPaths(n-2,path+"2");
        printStairPaths(n-3,path+"3");
    }
}
