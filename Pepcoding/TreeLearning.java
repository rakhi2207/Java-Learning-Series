package Pepcoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TreeLearning {
    public static class Node
    {
        int data;
        ArrayList<Node> a=new ArrayList<>();
    }

    public static int size(Node root)
    {
        int size=0;
        for(Node i:root.a)
        {
            size=size(i);
        }
        size=size+1;
        return size;
    }

    public static int max(Node root)
    {
        int v=Integer.MIN_VALUE;
        for(Node i:root.a)
        {
            int val=max(i);
            if(val>v)
            {
                v=val;
            }
        }
        if(root.data>v)
            v= root.data;
        return v;
    }
    public static void displayTree(Node root)
    {          System.out.println(root.data);
        if(root.a.size()==0)
        {
            return ;
        }
        for(Node i:root.a)
        {
            displayTree(i);
        }
    }
    public static Node createTree(int[] arr)
    {
        Stack<Node> s=new Stack<>();
        Node root=null;
        for(int i:arr)
        {
            if(s.size()>0)
            {
                Node t=new Node();
                t.data=i;
                if(i==-1)
                {
                    s.pop();
                }else
                {
                    s.peek().a.add(t);
                    s.push(t);
                }
            }else
            {
                Node t=new Node();
                t.data=i;
                root=t;
                s.push(t);
            }

        }

        return root;
    }

    public static ArrayList<Integer> getPath(Node root, int k)
    {
        if(root.data==k)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(root.data);
            return ans;
        }
        for(Node children:root.a)
        {
            ArrayList<Integer> fans=getPath(children,k);
            if(fans.size()>0)
            {
                fans.add(root.data);
                return fans;
            }
        }
        return new ArrayList<>();
    }
    public static int getHeight(Node root)
    {
        int height=-1;
        for(Node childern:root.a)
        {
           int val=getHeight(childern);
           height=Math.max(val,height);
        }
        height++;
        return height;
    }


    public static void reverse(Node root)
    {
        for(Node children:root.a)
        {
            reverse(children);
        }
        Stack<Node> s=new Stack<>();
        for(int i=0;i<root.a.size();i++)
        {
            s.push(root.a.get(i));
        }
        root.a.clear();
        while(s.size()>0)
        {
            root.a.add(s.pop());
        }
    }

    public static void linearize(Node root)
    {
       for(Node i:root.a)
       {
           linearize(i);
       }
       while(root.a.size()>1)
       {
           Node fl=root.a.remove(root.a.size()-1);
           Node sl=root.a.get(root.a.size()-1);
           Node last=getLast(sl);
           last.a.add(fl);
       }
    }

    public static Node getLast(Node node)
    {
        while(node.a.size()>0)
        {
            node=node.a.get(0);
        }
        return node;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,-1,80,-1,-1,15,70,-1,85,-1,-1,40,90,-1,100,-1,-1,-1};
        Node root=createTree(arr);
        ArrayList<Integer> path=getPath(root,100);

        linearize(root);
        displayTree(root);

        System.out.println(path);
        reverse(root);

        System.out.println("Height "+getHeight(root));
        System.out.println(size(root));
        System.out.println(max(root));

    }
}
