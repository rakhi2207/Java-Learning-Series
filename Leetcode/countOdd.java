package Leetcode;

public class countOdd {
    public static int countOdds(int low, int high) {
        int ans=(high-low)/2;
        if(low%2!=0 || high%2!=0)
            ans++;
        return ans;
    }
    public static int pow(int n,int b)
    {
        System.out.println(n);
        if(b==0)
        {
            return 1;
        }
        if(b%2==0)
        {
            return pow(n*n,b/2);
        }else
            return n*pow(n*n,b/2);
    }
    public static void main(String[] args) {
        System.out.println(pow(9,2));
    }
}
