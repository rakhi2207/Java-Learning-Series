package Pepcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            StringBuilder ans= new StringBuilder("");
            if(s.charAt(i)==')')
            {
                while(st.size()>0&&!st.peek().equals("("))
                {
                    ans.insert(0,st.pop());
                }
                if(st.size()>0&&st.peek().equals("("))
                {
                    ans.insert(0,st.pop());
                    ans.append(')');
                }
                st.push(ans.toString());
            }else
            {
                st.push(s.charAt(i)+"");
            }
            System.out.println(st);
        }

       StringBuilder ans=new StringBuilder("");
        while(st.size()>0&&!st.peek().equals("("))
        {
            ans.insert(0,st.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = reverseParentheses(read.readLine());
        System.out.println(result);
    }
}
