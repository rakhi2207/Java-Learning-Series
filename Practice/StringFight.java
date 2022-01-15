package Practice;


import java.util.Scanner;

public class StringFight {

    public static int findSubstring(char[] input,int a,char b)
    {
        int ans=0;
        int length = input.length;
        for (int i=0; i < length ; i++)
        {
            int count=0;
            StringBuilder str = new StringBuilder();
            str.append(input[i]);
            if(input[i]==b)
            {
                count++;
            }
            if(count==a)
            {
                ans++;
            }
            for (int j=i+1; j <= length ; j++)
            {
                if (j < length)
                {
                    if(input[j]==b)
                    {
                        count++;
                    }
                    if(count==a)
                    {
                        ans++;
                    }else if(count>a)
                    {
                        break;
                    }
                    str.append(input[j]);
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int p = scan.nextInt();
            char c =(char)(scan.nextInt()+'0');
            String inputString = scan.next();
            System.out.println(findSubstring(inputString.toCharArray(), p, c));
        }
    }
}
