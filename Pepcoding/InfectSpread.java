package Pepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class InfectSpread {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }
    static class Pair
    {
        int val;
        int time;
        Pair(int val,int time)
        {
            this.val=val;
            this.time=time;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        // write your code here
        boolean[] visited=new boolean[vtces];
        System.out.println( getAns(src,t,visited,graph));
    }
    public static int getAns(int src,int t,boolean[] visited,ArrayList<Edge>[] graph)
    {
        Queue<Pair> q=new ArrayDeque<>();
        q.offer(new Pair(src,1));
        int count=0;
        while(q.size()>0&&q.peek().time<=t)
        {
            Pair ans=q.poll();
            if(!visited[ans.val])
                count++;

            visited[ans.val]=true;
            for(Edge edge:graph[ans.val])
            {
                if(!visited[edge.nbr])
                {
                    q.offer(new Pair(edge.nbr, ans.time+1));
                }
            }
        }
        return  count;
    }
}
