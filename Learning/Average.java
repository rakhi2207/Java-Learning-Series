package Learning;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s= scan.nextInt();
        while(s-->0) {
            int n= scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int i = 0;
            int count = 0;
            while (i < n - 1) {
                int j = i + 1;
                while (j < n) {
                    if ((arr[i] + arr[j]) / 2 >= k) {
                        count += n - j;
                       // System.out.println("count "+count);
                        break;
                    } else {
                        j++;
                    }
                }
                i++;
            }
            System.out.println(count);
        }
    }
}
