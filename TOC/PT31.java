package TOC;
import java.util.Scanner;
import java.util.regex.*;
public class PT31 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Pattern p=Pattern.compile("a*b+");
         Matcher m=p.matcher(s);
         int count=0;
         while(m.find())
        {
            count++;
            System.out.println(m.group());
         }

         if(count==0)
         {
             System.out.println("Rejected");
         }else
         {
             System.out.println("Accepted");
         }
    }
}
