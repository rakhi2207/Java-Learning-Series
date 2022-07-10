package CollegeDSA;

public class FinallyPreference {
    public static int foo()
    {
        try
        {
            return 1;
        }finally{
            return 2;
        }
    }
    public static void main(String[] args) {
       int x=foo();
        System.out.println(x);
    }
}
