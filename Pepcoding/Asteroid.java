package Pepcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Asteroid {

    public static int[] asteroidCollision(int[] asteroids) {
        // complete this function
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            boolean flag=true;
            while(st.size()>0) {
                if (st.peek() < 0 && asteroids[i] > 0) {
                    flag=false;
                    if (Math.abs(st.peek()) == asteroids[i]) {
                        st.pop();
                        break;
                    } else {
                        if(Math.abs(st.peek())<asteroids[i])
                        {
                            st.pop();
                        }else
                        {
                            break;
                        }
                    }
                } else if (st.peek() > 0 && asteroids[i] < 0) {
                    flag=false;
                    if (Math.abs(asteroids[i]) ==st.peek() ) {
                        st.pop();
                        break;
                    } else {
                        if(Math.abs(asteroids[i])<st.peek())
                        {
                            break;
                        }else
                        {
                            st.pop();
                        }
                    }
                } else {
                    break;
                }
            }

            if(flag)
            {
                st.push(asteroids[i]);
            }

        }
        int[] arr=new int[st.size()];
        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=st.pop();
        }
        return arr;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)arr[i] = Integer.parseInt(read.readLine());
        int result[] = asteroidCollision(arr);

        System.out.println(result.length);
        for (int e : result) {
            System.out.println(e);
        }
    }
}
