package Pepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class exclusive_time_of_functions_official {
    static class Pair
    {
        int idx;
        int mval;
        int cval;
        Pair(int idx,int mval,int cval)
        {
            this.idx=idx;
            this.mval=mval;
            this.cval=cval;
        }
    }
    static Stack<Pair> st=new Stack<>();
    public static void getTime(String[] val,int[] ans)
    {
        //System.out.println("ans "+val[0]+" "+val[1]+" "+val[2]);
        if(val[1].equals("start"))
        {
            st.push(new Pair(Integer.parseInt(val[0]),Integer.parseInt(val[2]),0));
        }else
        {
            Pair p=st.pop();
            int value=Integer.parseInt(val[2])-p.mval+1;
            int cval=value-p.cval;
           // System.out.println("value "+value);
            ans[Integer.parseInt(val[0])]+=cval;
            if(st.size()>0)
                st.peek().cval+=value;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // use read for taking input
        int vet=Integer.parseInt(read.readLine());
        int Edges=Integer.parseInt(read.readLine());
        int[] ans=new int[vet];
        for(int i=0;i<Edges;i++)
        {
            String[] log=read.readLine().trim().split(":");
            getTime(log,ans);
        }
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}
