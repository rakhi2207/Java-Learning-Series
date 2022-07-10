package Pepcoding.Level1.GettingStarted;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidateStack {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        // Write Your's code here
        Stack<Integer> s=new Stack<>();
        int i=0;
        for(int j=0;j<pushed.length;j++)
        {
            s.push(pushed[j]);
            if(popped[i]==s.peek())
            {
                s.pop();
                i++;
            }
        }
        while (s.size()>0&&s.peek()==popped[i])
        {
            s.pop();
            i++;
        }
        if(s.empty())
        {
            return true;
        }
        return false;
    }

    public static int[] getArr(String s){
        String nums[] = s.split(" ");
        int n = nums.length;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = Integer.parseInt(nums[i]);
        }
        return ar;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int pushed [] = getArr(read.readLine());
        int popped [] = getArr(read.readLine());

        boolean result = validateStackSequences(pushed, popped);

        System.out.println(result);
    }
}
