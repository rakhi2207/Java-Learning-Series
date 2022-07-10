package Tree;

import java.util.*;

public class DiagonalTraversal{
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<ArrayList<Integer>> diagonalOrder(TreeNode root) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int size=q.size();
            TreeNode val=q.peek();
            ArrayList<Integer> small=new ArrayList<>();
            while(size>0)
            {
                if(val==null)
                {
                    q.poll();
                    if(q.size()>0)
                        val=q.peek();
                    size--;
                    if(size==0)
                    {
                        break;
                    }
                }
                if(val.left!=null)
                {
                    q.add(val.left);
                }
                small.add(val.val);
                val=val.right;
            }
            ans.add(small);
        }
        return ans;
    }

    // input_section=================================================

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        ArrayList<ArrayList<Integer>> ans = diagonalOrder(root);
        int idx = 0;
        for (ArrayList<Integer> i : ans) {
            System.out.print(idx++ + " -> ");
            for (Integer j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}