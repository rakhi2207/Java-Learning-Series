package TOC;

import java.util.Scanner;

public class PT32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of lines in code ");
        int n= scan.nextInt();
        System.out.println("Enter the source code ");
        int count = 0;
        scan.nextLine();
        while(n-->0) {
            String str = scan.nextLine();
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == '/' && str.charAt(i + 1) == '/') {
                    count++;
                }
                if (str.charAt(i) == '/' && str.charAt(i + 1) == '*') {
                    count++;
                }
            }
        }
        System.out.println("count "+count);
    }
}
