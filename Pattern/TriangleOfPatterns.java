package Pattern;

import java.util.Scanner;

public class TriangleOfPatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = n - 1, val;
        for (int i = 0; i < n; i++) {
            val = i;
            for (int j = 0; j <= n - 1 + i; j++) {
                if (j < count) {
                    System.out.print(" ");
                } else if (j <= n - 1) {
                    val++;
                    System.out.print(val);
                } else {
                    val--;
                    System.out.print(val);
                }
            }
            count--;
            System.out.println();
        }
    }
}
