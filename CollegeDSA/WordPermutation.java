package CollegeDSA;

import java.util.Scanner;

public class WordPermutation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        boolean[] used=new boolean[s.length()];
        getAns(0,s.length(),used,"",s);
    }

    private static void getAns(int i, int length, boolean[] used, String s,String val) {
        //System.out.println(s+" "+i);
        if(i==length)
        {
            System.out.println(s);
            return ;
        }
        for(int start=0;start<length;start++)
        {
            if(!used[start])
            {
                used[start]=true;
                getAns(i+1,length,used,s+val.charAt(start),val);
                used[start]=false;
            }
        }
    }
}
