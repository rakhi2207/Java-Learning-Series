package Pepcoding;

import java.util.Scanner;

public class Subsequence {
    static  int M=1000000007;
    static final int BITS = 32;

    static int andSum(int set[])
    {

        int n = set.length;
        int total=0;

        for (int i = 0; i < (1<<n); i++)
        {
            int sum=1;

            for (int j = 0; j < n; j++)

                if ((i & (1 << j)) > 0)

                    sum = sum & set[j];

            total= (total%M+sum%M);


        }
        return  total;
    }
    public static void main(String[] args) {
       int[] arr={1,2,3,4};
        System.out.println(andSum(arr));
//       int ans=0;
//       for(int i=0;i<arr.length;i++)
//       {
//           ans=(ans%M+arr[i]%M)%M;
//           int val=arr[i]%M;
//           for(int j=i+1;j<arr.length;j++)
//           {
//               val=val&arr[j];
//               ans=(ans%M+val%M)%M;
//           }
//       }
//        System.out.println(ans);

    }
}
