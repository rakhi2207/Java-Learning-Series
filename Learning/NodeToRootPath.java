package Learning;

import java.util.ArrayList;

class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
class GfG {

    ArrayList<Integer> NodeToRootPath(Node root, int x)
    {
        if(root==null)
        {
            return new ArrayList<Integer>();
        }
        if(root.data==x)
        {
            ArrayList<Integer> a=new ArrayList<>();
            a.add(x);
            return a;
        }

        ArrayList<Integer> left=NodeToRootPath(root.left,x);
        if(left.size()>0)
        {
            left.add(root.data);
            return left;
        }
        ArrayList<Integer> right=NodeToRootPath(root.right,x);
        if(right.size()>0)
        {
            right.add(root.data);
            return right;
        }

        return new ArrayList<Integer>();
    }
    int findDist(Node root, int y, int b) {
        // Your code here
        ArrayList<Integer> a=NodeToRootPath(root,y);
        ArrayList<Integer> a1=NodeToRootPath(root,b);
        System.out.println(a);
        System.out.println(a1);
        //int count=Math.abs(a.size()-a1.size());
        int count=a1.size()+a.size();
        System.out.println("count "+count);
        for(int i=a.size()-1,j=a1.size()-1;i>=0&&j>=0;i--,j--)
        {
            System.out.println(a.get(i)==a1.get(j));
            if(a.get(i)==a1.get(j))
            {
                count-=2;
                System.out.println(a.get(i)+" "+a1.get(j)+" "+count);
            }else
            {
                break;
            }
        }

        return count;
    }
}
public class NodeToRootPath {
    public static void main(String[] args) {
        int x=1063376696;
        int y=2126753390;
        long z=x+y;
        System.out.println(z);
    }
}
