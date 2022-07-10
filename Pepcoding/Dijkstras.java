package Pepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstras {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair>
    {
        int idx;
        int weight;
        String s;
        Pair(int idx,int weight,String s)
        {
            this.idx=idx;
            this.weight=weight;
            this.s=s;
        }

        public int compareTo(Pair p)
        {
            return this.weight-p.weight;
        }
    }
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int vtces = Integer.parseInt(br.readLine());
//        ArrayList<Edge>[] graph = new ArrayList[vtces];
//        for (int i = 0; i < vtces; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        int edges = Integer.parseInt(br.readLine());
//        for (int i = 0; i < edges; i++) {
//            String[] parts = br.readLine().split(" ");
//            int v1 = Integer.parseInt(parts[0]);
//            int v2 = Integer.parseInt(parts[1]);
//            int wt = Integer.parseInt(parts[2]);
//            graph[v1].add(new Edge(v1, v2, wt));
//            graph[v2].add(new Edge(v2, v1, wt));
//        }
//
//        int src = Integer.parseInt(br.readLine());
//        // write your code here
//        boolean[] visited=new boolean[vtces];
//        PriorityQueue<Pair> pq=new PriorityQueue<Pair>();
//        pq.offer(new Pair(src,0,src+""));
//        while(pq.size()>0)
//        {
//            Pair val=pq.poll();
//            //if(!visited[val.idx])
//                System.out.println(val.idx+"via"+val.s+"@"+val.weight);
//            visited[val.idx]=true;
//            for(Edge edge:graph[val.idx])
//            {
//                if(!visited[edge.nbr])
//                {
//                    pq.offer(new Pair(edge.nbr,val.weight+edge.wt,val.s+edge.nbr));
//                }
//            }
        //}

    }
}
