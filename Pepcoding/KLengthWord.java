package Pepcoding;
import java.io.*;
import java.util.*;
public class KLengthWord {
    public static void getAns(int lcb,int ssf,int ts,String ustr,String asf)
    {
        if(ssf==ts)
        {
            System.out.println(asf);
            return;
        }
        for(int i=lcb+1;i<ustr.length();i++)
        {
            getAns(i,ssf+1,ts,ustr,asf+ustr.charAt(i));
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (unique.contains(ch) == false) {
                unique.add(ch);
                ustr += ch;
            }
        }
        getAns(-1,0,k,ustr,"");

    }
}
