package Pepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class remove_duplicate_letters_official {
    public static String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }else
            {
                h.put(s.charAt(i),1);
            }
        }
        boolean[] presence=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            while(st.size()>0&&st.peek()>s.charAt(i)&&!presence[s.charAt(i)-'a']&&h.get(st.peek())>0)
            {
               // System.out.println(st+" "+h.get(st.peek()));
                    char ch=st.pop();
                    presence[ch-'a']=false;
            }
            if(!presence[s.charAt(i)-'a']) {
                st.push(s.charAt(i));
                presence[s.charAt(i) - 'a'] = true;
            }
            h.put(s.charAt(i), h.get(s.charAt(i)) - 1);
        }

        StringBuilder ss=new StringBuilder("");
        while(st.size()>0)
        {
            ss.insert(0,st.pop());
        }
        return ss.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = removeDuplicateLetters(read.readLine());
        System.out.println(result);

    }
}
