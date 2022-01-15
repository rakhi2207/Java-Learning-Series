package Durga;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class classChecker {
    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        ArrayList<Pairs> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            a.add(new Pairs(arr[i][0],arr[i][1]));
        }

        Collections.sort(a);
        Stack<Pairs> s=new Stack<>();
        s.add(a.get(0));
        for(int i=0;i<a.size();i++)
        {
            if(s.peek().b>a.get(i).a)
            {
                if(s.peek().b<a.get(i).b)
                {
                    Pairs p=s.pop();
                    p.b=a.get(i).b;
                    s.add(p);
                }
            }else
            {
                s.push(a.get(i));
            }
        }

        for(Pairs i:s)
        {
            System.out.println(i.a+" "+i.b);
        }



    }

    public static void main(String[] args) {
        int[][] arr={{22,28},{1,8},{25,27},{14,19},{27,30},{5,12}};
        mergeOverlappingIntervals(arr);
//        ArrayList<Pairs> a=new ArrayList<>();
//        for(int i=0;i<arr.length;i++)
//        {
//            a.add(new Pairs(arr[i][0],arr[i][1]));
//        }

       // Collections.sort(a);
//        for(Pairs i:a)
//        {
//            System.out.println(i.a+" "+i.b);
//        }

//        Stack<Pairs> s=new Stack<>();
//        s.add(a.get(0));
//        for(int i=0;i<a.size();i++)
//        {
//            if(s.peek().b>a.get(i).a)
//            {
//                if(s.peek().b<a.get(i).b)
//                {
//                    Pairs p=s.pop();
//                    p.b=a.get(i).b;
//                    s.add(p);
//                }
//            }else
//            {
//                s.push(a.get(i));
//            }
//        }
//
//        for(Pairs i:s)
//        {
//            System.out.println(i.a+" "+i.b);
//        }
    }
}
class Pairs implements Comparable<Pairs>
{
     int a;
     int b;
    Pairs(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    public  int compareTo(Pairs o)
    {
        // Pairs p=(Pairs)o;
        if(o.a>this.a)
        {
            return -1;
        }else
        {
            return 1;
        }
    }

}
