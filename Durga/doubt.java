package Durga;

import java.util.Stack;

public class doubt {
    public static Stack characterStack(Stack in1, Stack in2)
    {
        Stack out=new Stack();
        Stack temp=new Stack();
        while(!in1.isEmpty())
        {
            String str1=(String)in1.pop();
            temp.push(str1);
        }
        while (!temp.isEmpty())
        {
            String str1=(String) temp.pop();
            String str2=(String)in2.pop();
            if(str1.contains(str2))
            {
                int count=0;
                for(int index=0;index<str1.length();index++)
                {
                    if(str1.substring(index,index+1).equals(str2))
                    {
                        count++;
                    }
                    out.push(str1+":"+count);
                }
            }else
            {
                out.push(str1+":"+str2);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        Stack in=new Stack();
        in.add("Lily");
        in.add("Lavender");
        in.add("Sunflower");
        in.add("Hibscus");
        in.add("Orchid");
        in.add("Lotus");
        in.add("Rose");

        Stack inS=new Stack();
        inS.add("10");
        inS.add("30");
        inS.add("55");
        inS.add("34");
        inS.add("25");
        inS.add("20");
        inS.add("23");

        Stack s=characterStack(in,inS);
        System.out.println(s);
    }
}
