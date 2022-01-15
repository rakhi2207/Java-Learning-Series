package Practice;

public class PracticeStatic {

    static int num=0;

    public void checker()
    {
        num=10;
    }
    public static void main(String[] args)
    {
        PracticeStatic c=new PracticeStatic();
        c.num=1;
        PracticeStatic c1=new PracticeStatic();
        c1.num=19;
        PracticeStatic c2=new PracticeStatic();
        c2.checker();
        System.out.println(c2.num);
    }
}
