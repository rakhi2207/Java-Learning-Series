package Pepcoding;


public class switchAnalyser {
    public static int solve(char op,int value1,int value2)
    {
        switch(op)
        {
            case'+':
                return value1+value2;
            case'-':
                return value1-value2;
            case'*':
                return value1*value2;
            case'/':
                return value1/value2;
        }
            return -1;

    }
    public static void main(String[] args) {
        char op='+';
        int value1=2;
        int value2=3;

    }
}
