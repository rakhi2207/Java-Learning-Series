package CollegeDSA;

import java.util.Scanner;


public class StringNewLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        int i=0,j=1;
        while(j<s.length()&&i<s.length())
        {
            if((s.charAt(i)=='0'&&s.charAt(j)=='1')||(s.charAt(i)=='1'&&s.charAt(j)=='0'))
            {
                s=s.substring(0,i)+s.substring(j+1);
            }else
            {
                j++;
                i++;
            }
        }
        System.out.println(s.length());
    }
}
