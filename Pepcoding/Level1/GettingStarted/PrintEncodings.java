package Pepcoding.Level1.GettingStarted;

import java.util.Scanner;

public class PrintEncodings {

    static String[] alp={".","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        printEncodings(s,"");
    }

    public static void printEncodings(String str,String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return ;
        }
            int one=str.charAt(0)-'0';
            if(one==0)
            {
                return;
            }
            printEncodings(str.substring(1),asf+alp[one]);
        if(str.length()>=2)
        {
            String val= str.substring(0,2);
            Integer check=Integer.parseInt(val);
            if(val.charAt(0)=='0'||check>26)
            {
                return;
            }
            printEncodings(str.substring(2),asf+alp[check]);
        }
    }

}
