package Pattern;

import java.util.Scanner;

public class SieveOfErathoseis {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       boolean[] arr=new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            for(int j=i*2;j<=n;j+=i)
            {
                if(!arr[j])
                    arr[j]=true;
            }
        }

        for(int i=2;i<=n;i++)
        {
            if(!arr[i])
                System.out.println(i);
        }
    }
}
