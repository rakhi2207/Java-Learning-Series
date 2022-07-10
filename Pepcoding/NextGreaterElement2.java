package Pepcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement2 {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(read.readLine());
        }

        int ans[] = nextGreaterElementII(nums);

        n = ans.length;

        System.out.println(n);
        for(int e: ans){
            System.out.println(e);
        }

    }

    private static int[] nextGreaterElementII(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i< nums.length;i++)
        {
            while (s.size()>0&&nums[i]>nums[s.peek()])
            {
                ans[s.pop()]=nums[i];
            }
            s.push(i);
        }
        for(int i=0;i< nums.length;i++)
        {
            while (s.size()>0&&nums[i]>nums[s.peek()])
            {
                ans[s.pop()]=nums[i];
            }
        }
        while (s.size()>0)
        {
            ans[s.pop()]=-1;
        }
        return ans;
    }
}
