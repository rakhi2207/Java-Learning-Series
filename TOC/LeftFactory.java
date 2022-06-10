package TOC;

import java.util.Scanner;

public class LeftFactory {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        s=s.substring(3);
        String[] arr=s.split("/");
        char c=arr[0].charAt(0);
        boolean check=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].charAt(0)!=c)
            {
                check=false;
            }
        }
        if(check)
        {
            System.out.println("A->"+c+"A'");
            String value="A'->";
            for(String x:arr)
            {
                value+=x.substring(1)+"/";
            }
            System.out.println(value.substring(0,value.length()-1));
        }else
        {
            System.out.println("Left Factory is not there");
        }
    }
}
