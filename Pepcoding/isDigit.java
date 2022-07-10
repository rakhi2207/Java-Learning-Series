package Pepcoding;

public class isDigit {
    public static boolean isDigit(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDigit("24"));
        String s='('+"";
        System.out.println("("==s);
    }
}
