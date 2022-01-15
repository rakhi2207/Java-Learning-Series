package Practice;


import Durga.A;

import java.util.ArrayList;
import java.util.Stack;

class Node1
{
    int data;
    ArrayList<Node1> children=new ArrayList<Node1>();
    Node1(int data)
    {
        this.data=data;
    }
}
public class GenericTreeConstruction {

    public static int size(Node1 root)
    {
        int size=root.children.size();
        if(root.children.size()==0)
        {
            return 0;
        }else
        {
            for(Node1 i:root.children)
            {
                size+=size(i);
            }
            return size;
        }
    }

    public static void printNode(Node1 root)
    {
        System.out.println(root.data);
        if(root.children.isEmpty())
        {
            return;
        }
        for(Node1 i:root.children)
        {
            printNode(i);
        }
    }


    public static void main(String[] args) {
        Stack<Node1> s=new Stack<Node1>();

        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node1 root = null;
        for(int i:arr) {
            if (s.isEmpty()) {
                Node1 n = new Node1(i);
                s.push(n);
                root = n;
            }else
            {
                if(i==-1)
                {
                    s.pop();
                }else
                {
                    Node1 n = new Node1(i);
                    Node1 x=s.peek();
                    x.children.add(n);
                    s.push(n);
                }
            }
        }

        printNode(root);
        System.out.println(size(root));
    }
}
