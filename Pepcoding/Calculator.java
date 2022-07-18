package Pepcoding;
import java.io.*;
import java.util.*;

public class Calculator {

    public static int calculate(String s){
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
          //  System.out.println(st+" "+s.charAt(i));
            if(s.charAt(i)==')')
            {
                while(st.size()>0&&!st.peek().equals("(")){
                    Integer val1=0,mul=1;
                    while(st.size()>0&&!st.peek().equals("+")&&!st.peek().equals("-")&&!st.peek().equals("("))
                    {
                        val1+=Integer.parseInt(st.pop())*mul;
                        mul=mul*10;
                    }
                    String sign="";
                    if(st.size()>0){
                        sign=st.pop();
                    }
                    int val2=0;
                    mul=1;
                    while(st.size()>0&&!st.peek().equals("+")&&!st.peek().equals("-")&&!st.peek().equals("("))
                    {
                        val2+=Integer.parseInt(st.pop())*mul;
                        mul=mul*10;
                    }
                  // System.out.println(val1+" "+val2+" "+sign);
                    Integer ans=0;
                    if(sign.equals("+"))
                    {
                        ans=val1+val2;
                    }
                    else
                    {
                        ans=val2-val1;
                    }
                    if(st.peek().equals("("))
                    {
                        st.push(ans.toString());
                        break;
                    }
//                    System.out.println("val1 "+ans+" "+st);
                   st.push(ans.toString());
                }
                    String val=st.pop();
                    st.pop();
                    st.push(val);
            }else
            {
                if(s.charAt(i)!=' ') {
                    st.push(s.charAt(i) + "");
                }
            }
        }
        if(st.size()==1)
        {
            return Integer.parseInt(st.pop());
        }
        System.out.println(st);
        int v1=Integer.parseInt(st.pop());
        String ch=st.pop();
        int v2=Integer.parseInt(st.pop());
        if(ch.equals("+"))
        {
            return v1+v2;
        }else
        {
            return v2-v1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int result = calculate(read.readLine());
        System.out.println(result);

    }
}
