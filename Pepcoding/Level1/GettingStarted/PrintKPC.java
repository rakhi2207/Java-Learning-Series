package Pepcoding.Level1.GettingStarted;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        printKPC(s,"");
    }
    static String[] val={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return ;
        }
        int idx=str.charAt(0)-'0';
        String value=val[idx];
        for(int i=0;i<value.length();i++)
        {
            printKPC(str.substring(1),asf+value.charAt(i));
        }
    }
}
