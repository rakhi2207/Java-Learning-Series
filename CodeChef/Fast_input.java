package CodeChef;
import  java.io.*;
import java.util.StringTokenizer;

public class Fast_input {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader s = new FastReader();
        int n = s.nextInt();
        while (n-- > 0) {
            int N = s.nextInt();
            int k = s.nextInt();
            s.nextLine();
            String val=s.nextLine();
            String star="";
            for(int i=0;i<k;i++)
            {
                star=star+"*";
            }
            if(val.contains(star))
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}