import java.io.*;
import java.util.*;

public class Main {

    static class Pair implements Comparable<Pair>
    {
        int weight;
        int prize;
        Double ratio;
        Pair(int weight,int prize,Double ratio)
        {
            this.weight=weight;
            this.prize=prize;
            this.ratio=ratio;
        }

        public int compareTo(Pair p)
        {
            return (int)(p.ratio-this.ratio);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] weight=new int[n];
        int[] prize=new int[n];
        for(int i=0;i<n;i++)
        {
            prize[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            weight[i]=scan.nextInt();
        }


        int cap=scan.nextInt();

        PriorityQueue<Pair> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            q.offer(new Pair(weight[i],prize[i],prize[i]+0.0/weight[i]+0.0));
        }
        int ans=0;

        for(Pair p:q)
        {
            System.out.println(p.weight+" "+p.prize+" "+p.ratio);
        }
    }
}