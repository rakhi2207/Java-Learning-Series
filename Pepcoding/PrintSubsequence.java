package Pepcoding;

import java.util.Scanner;

public class PrintSubsequence {
    public static void printSubsequence(String val,String asf)
    {
        if(val.length()==0)
        {
            System.out.println(asf);
            return ;
        }
        char ch=val.charAt(0);
        printSubsequence(val.substring(1),asf+ch);
        printSubsequence(val.substring(1),asf);

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String val=scan.nextLine();
        printSubsequence(val,"");
    }
}
