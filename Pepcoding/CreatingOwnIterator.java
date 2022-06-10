package Pepcoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class CreatingOwnIterator {
    public static class Node
    {
        int data;
        ArrayList<Node> a=new ArrayList<>();
    }

    static class GenericTree implements Iterable<Integer>
    {
        Node root;
        GenericTree(Node n)
        {
            root=n;
        }
        @Override
        public Iterator<Integer> iterator()
        {
            Iterator<Integer> obj=new GenericTreePreorder(root);
            return obj;
        }
    }

    static class GenericTreePreorder implements Iterator<Integer>
    {
        Node root;
        Integer nval=null;
        Stack<Pair> s=new Stack<>();
        GenericTreePreorder(Node n)
        {
            root=n;
            s.push(new Pair(root,-1));
            next();
        }
        @Override
        public boolean hasNext() {
           if(nval==null)
           {
               return false;
           }
           return true;
        }

        class Pair
        {
            Node value;
            int pos;
            Pair(Node value,int pos)
            {
                this.value=value;
                this.pos=pos;
            }
        }
        @Override
        public Integer next() {

           Integer nr=nval;
           nval=null;
           while(s.size()>0)
           {
               if(s.peek().pos==-1)
               {
                   nval=s.peek().value.data;
                   s.peek().pos++;
                   break;
               }else if(s.peek().pos==s.peek().value.a.size())
               {
                   s.pop();
               }else
               {
                   Node n=s.peek().value.a.get(s.peek().pos);
                   s.peek().pos++;
                   s.push(new Pair(n,-1));
               }
           }

           return nr;
        }
    }
    public static Node createTree(int[] arr)
    {
        Stack<Node> s=new Stack<>();
        Node root=null;
       for(int i=0;i<arr.length;i++)
       {
           if(s.size()==0)
           {
               Node n=new Node();
               n.data=arr[i];
               s.push(n);
               root=n;
           }else if(arr[i]==-1)
           {
               s.pop();
           }else
           {
               Node nn=new Node();
               nn.data=arr[i];
               s.peek().a.add(nn);
               s.push(nn);
           }
       }
       return root;
    }

    public static void displayTree(Node node)
    {
        System.out.println(node.data);
        for(Node child:node.a)
        {
            displayTree(child);
        }
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,-1,80,-1,-1,15,70,-1,85,-1,-1,40,90,-1,100,-1,-1,-1};
        Node root=createTree(arr);
        GenericTree gt=new GenericTree(root);
        for(int i:gt)
        {
            System.out.println(i);
        }
//        Iterator gti=gt.iterator();
    }
}
