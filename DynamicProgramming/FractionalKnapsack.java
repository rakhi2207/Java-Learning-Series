package DynamicProgramming;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FractionalKnapsack {
    static class Pair implements Comparable<Pair>
    {
        int weight;
        int values;
        double fraction;
        Pair(int weight,int values,double fraction)
        {
            this.weight=weight;
            this.values=values;
            this.fraction=fraction;
        }
        public int compareTo(Pair p)
        {
            if(this.fraction>p.fraction)
            {
                return -1;
            }
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] values=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++)
        {
            values[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            weight[i]= scan.nextInt();
        }
        int cap= scan.nextInt();
        PriorityQueue<Pair> q=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            q.offer(new Pair(weight[i],values[i],values[i]*1.0/weight[i]));
        }
        double ans=0.0;
        while(cap>0)
        {
            Pair p=q.poll();
            if(p.weight<=cap)
            {
                ans+=p.values;
                cap=cap-p.weight;
            }else
            {
                ans+=p.fraction*cap;
                cap=0;
            }
        }
        System.out.println(ans);
    }
}
