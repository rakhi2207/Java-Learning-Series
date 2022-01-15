package Durga;


public class MultiCatchBlock {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/10);
            String s=null;
            System.out.println(s.length());
        }catch (ArithmeticException |NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
