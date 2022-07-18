package Pepcoding.Level1.GettingStarted;

import java.util.Scanner;

public class PermutaitonsString {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        printPermutations(s,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            printPermutations(str.substring(0,i)+str.substring(i+1),asf+str.charAt(i));
        }
    }
}
