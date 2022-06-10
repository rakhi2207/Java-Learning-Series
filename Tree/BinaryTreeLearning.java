package Tree;

import java.util.Stack;

public class BinaryTreeLearning {
    static class Node
    {
        Integer data;
        Node left;
        Node right;
    }
    static class pair
    {
        Node data;
        int helper;
        public pair(Node data, int helper) {
            this.data = data;
            this.helper = helper;
        }

    }
    public static Node construct(Integer[] arr)
    {
        Stack<pair> s=new Stack<>();
        Node n=new Node();
        n.data=arr[0];
        pair p=new pair(n,0);
        s.push(p);
        int i=1;
        while(i<arr.length&&s.size()>0)
        {
            if(s.peek().helper==0)
            {
                if(arr[i]==null)
                {
                    s.peek().data.left = null;
                    s.peek().helper++;
                }else {
                    Node x = new Node();
                    x.data = arr[i];
                    s.peek().data.left = x;
                    s.peek().helper++;
                    pair v = new pair(x, 0);
                    s.push(v);
                }
                i++;
            }else if(s.peek().helper==1)
            {
                if(arr[i]==null)
                {
                    s.peek().data.right = null;
                    s.peek().helper++;
                }else {
                    Node x = new Node();
                    x.data = arr[i];
                    s.peek().data.right = x;
                    s.peek().helper++;
                    pair v=new pair(x,0);
                    s.push(v);
                }
                i++;
            }else
            {
                s.pop();
            }
        }
        return n;
    }
    static String in="";
    static String pre="";
    static String post="";
    public static void display(Node root)
    {
        if(root==null)
        {
            return ;
        }
        pre+=root.data+" ";
        display(root.left);
        in+=root.data+" ";
        display(root.right);
        post+=root.data+" ";
    }
    public static void main(String[] args) {
        Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=construct(arr);
        display(root);
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
}
