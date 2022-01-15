package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSubset {

    public static void findSubstring(char[] input,ArrayList<StringBuilder> a)
    {
        int length = input.length;
        for (int i=0; i < length ; i++)
        {
            StringBuilder str = new StringBuilder();
            str.append(input[i]);
            for (int j=i+1; j <= length ; j++)
            {
                StringBuilder s=new StringBuilder(str);
                a.add(s);
                if (j < length)
                {
                    str.append(input[j]);
                }
            }
        }


    }

    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int p=1,c=2;
                String inputString = in.next();
                ArrayList<StringBuilder> a=new ArrayList<>();
                findSubstring(inputString.toCharArray(),a);
                Collections.sort(a);

        for(StringBuilder s:a)
        {
            System.out.println(s);
        }


    }
}
