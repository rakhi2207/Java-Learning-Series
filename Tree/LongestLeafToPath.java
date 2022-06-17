package Tree;

import java.util.ArrayList;

public class LongestLeafToPath{

class abc
    {

    }
  class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}


    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        // Write your code here
        if(root==null)
        {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> left= longestRootToLeafPath(root.left);
        ArrayList<Integer> right= longestRootToLeafPath(root.right);
        left.add(root.data);
        right.add(root.data);
        return (left.size()>right.size())?left:right;
    }



}