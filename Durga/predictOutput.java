package Durga;

public class predictOutput
{
    final int assign = 30;

    public static void main(String[] args)
    {
        final int result = 20;
        final int assign;

        predictOutput f = new predictOutput();
        assign = 20;

        System.out.println(assign);
        System.out.println(process(result));
    }

    static int process(int a)
    {
        return a + 5;
    }
}