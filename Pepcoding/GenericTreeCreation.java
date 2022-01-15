package Pepcoding;


import java.util.*;


class Node
{
    int data;
    ArrayList<Node> a;
    Node(int data)
    {
        this.data=data;
        a=new ArrayList<>();
    }
}

public class GenericTreeCreation {

    public static int size(Node root)
    {
        int count=1;
        for(Node i:root.a)
        {
            count+=size(i);
        }

            return count;
    }

    public static void newLineTraversal(Node root)
    {
        Queue<Node> mq=new ArrayDeque<>();
        Queue<Node> cq=new ArrayDeque<>();

        mq.add(root);
        while (mq.size()>0)
        {
            Node t=mq.remove();
            System.out.print(t.data+" ");
            for(Node i:t.a)
            {
                cq.add(i);
            }
            if(mq.size()==0)
            {
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println();
            }

        }
    }

    public static void newLevelOrderTraversal2(Node root)
    {
        Queue<Node> q=new LinkedList<>();

        q.add(root);
        while(q.size()>0) {
            int x=q.size();
            for (int i = 0; i < x; i++) {
                Node t=q.poll();
                System.out.print(t.data+" ");
                for(Node z:t.a)
                {
                    q.add(z);
                }
            }
            System.out.println();
        }
    }
    public static void levelOrderTraversal(Node root)
    {
        Queue<Node> h=new LinkedList<>();
        h.add(root);
        h.add(null);
        while(!h.isEmpty()) {
            Node t = h.poll();
            if(t==null&&h.size()>0)
            {
                System.out.println();
                h.add(null);
            }else if(t!=null) {
                System.out.print(t.data);
                for (Node i : t.a) {
                    h.add(i);
                }
            }
        }
    }
    public static void display(Node root)
    {

        System.out.print(root.data+"-> ");

        for(Node i:root.a)
        {
            System.out.print(i.data+",");
        }
        System.out.print(".");
        System.out.println();
        for(Node i:root.a)
        {
            display(i);
        }
    }


    public static int max(Node root)
    {
        int max=root.data;

        for(Node i:root.a)
        {
            int val=max(i);
            if(val>max)
            {
                max=val;
            }
        }
        return max;
    }

    public static int height(Node root)
    {
        int h=-1;

        for(Node i:root.a)
        {
            h=Math.max(h,height(i));
        }

        h=h+1;
        return h;
    }

    public static void mirrorImage(Node root)
    {
        for(Node i:root.a)
        {
            mirrorImage(i);
        }

        Collections.reverse(root.a);
    }


    public static void removeLeaves(Node root)
    {
        for(int i=root.a.size()-1;i>=0;i--)
        {
            Node n=root.a.get(i);
            if(n.a.size()==0)
            {
                root.a.remove(n);
            }
        }

        for(Node i:root.a)
        {
            removeLeaves(i);
        }
    }


    public static void liner(Node root)
    {
        for(Node i:root.a)
        {
            liner(i);
        }
    }

    public static void main(String[] args) {
        int[] arr={10,-1};
        Stack<Node> s=new Stack<>();
        Node root=null;
        for(int i:arr)
        {
            if(i==-1)
            {
                s.pop();
            }else
            {
                Node t=new Node(i);
                if(s.size()>0)
                {
                    s.peek().a.add(t);
                }else
                {
                    root=t;
                }

                s.push(t);
            }
        }

        display(root);
        System.out.println(size(root));
        System.out.println(max(root));
        System.out.println(height(root));
        levelOrderTraversal(root);
        newLineTraversal(root);
        System.out.println();
        System.out.println();
        newLevelOrderTraversal2(root);
//        mirrorImage(root);
//        display(root);

        removeLeaves(root);

        System.out.println();
        System.out.println();

        display(root);
    }
}
