package Durga;
import java.util.*;
import java.util.Stack;
import java.util.regex.*;
public class PatternComparison {
    
    public static void main(String[] args) {
       HashSet<Integer> s=new HashSet<>();
       s.add(101);
       s.add(101);
       s.add(610);
       s.add(447);
       s.add(389);
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        HashSet<Integer> s1=new HashSet<>();
        s1.add(610);
        s1.add(4);
        s1.add(101);
        s1.add(4);
        s1.add(101);


        for(int i:s)
        {
            p.add(i);
        }

        for(int i:s1)
        {
            p.add(i);
        }
        s.retainAll(s1);
        System.out.println(s);

        if(s1.size()==0)
        {
            System.out.println("-1");
            return ;
        }

        int min=Integer.MAX_VALUE;
        for(Integer i:s1)
        {
            if(i<min)
                min=i;
        }
        int sum=0;

        while(min>0)
        {
            sum=sum+(min%10);
            min=min/10;
        }
        for(int i:s1)
        {
            System.out.print(i+" ");
        }

        while(sum-->0)
        {
            System.out.print(p.poll()+" ");
        }
    }
}
