package Leetcode;


import java.util.Stack;

public class UppwarsDiagonalTraverse {
    public static void main(String[] args) {
        int[][] arr={{1,2,3}};
        boolean check=true;
        int[] ans=new int[arr.length*arr[0].length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
                Stack<Integer> s=new Stack<>();
                int temp = i;
                for (int j = 0; j<=i&&j<arr[0].length; j++) {
                    if(check) {
                        ans[count] = arr[temp][j];
                        //System.out.println("check "+temp+" "+j+" "+check);
                        count++;
                    }
                    else
                    {
                        s.push(arr[temp][j]);
                        //System.out.println("check "+temp+" "+j+" "+check);
                    }
                    //System.out.println("temmp "+temp+" "+j);
                    temp--;
                }
                while(!s.empty())
                {
                    ans[count] = s.pop();
                    count++;
                }
                if(check)
                    check=false;
                else
                    check=true;
        }


        int ne=1;

        while (ne<arr[0].length)
        {
                Stack<Integer> s=new Stack<>();
                int tempi = ne, tempj = arr.length - 1;
                while (tempi < arr[0].length) {
                    if(check)
                    {
                        ans[count]=arr[tempj][tempi];
                        count++;
                    }else
                    {
                        s.push(arr[tempj][tempi]);
                    }
                    tempi++;
                    tempj--;
                }
            while(!s.empty())
            {
                ans[count] = s.pop();
                count++;
            }
            if(check)
                check=false;
            else
                check=true;
            ne++;
        }

        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
}
