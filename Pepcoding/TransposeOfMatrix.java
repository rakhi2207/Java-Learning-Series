package Pepcoding;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class TransposeOfMatrix {
    public static void  myfunction(int x)
    {
        if(x==0)
            return;

        myfunction(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
//
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int s=scan.nextInt();

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(n-->0)
        {
            pq.add(scan.nextInt());
        }

        System.out.println(pq);
        System.out.println("check "+pq.poll());
        int count=0;
        int chk=5;
        while(chk-->0)
        {
            int ele=pq.poll();
            System.out.println(ele);
            s=s-ele;
            pq.add(ele/2);
            count++;
        }

        System.out.println(count);
    }
}
