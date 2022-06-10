package TOC;
import java.util.Scanner;
import java.util.regex.*;
public class PatternCOmpile {
    public static void main(String[] args) {
        Scanner scan=new Scanner("System.in");
        String s=scan.nextLine();
       Pattern p=Pattern.compile("a*b+");
/*        Matcher m=p.matcher(s);
        while(m.find())
       {
            System.out.println(m.group());
        }*/
    }
}
