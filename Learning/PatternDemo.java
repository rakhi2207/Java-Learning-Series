package Learning;

import java.util.regex.*;

public class PatternDemo {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[0-1]*[00]+[0-1]*");
        Matcher m=p.matcher("01");
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}
