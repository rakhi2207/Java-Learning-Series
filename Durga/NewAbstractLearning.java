package Durga;


abstract  class C
{
    int x;
    C(int x)
    {
        this.x=x;
    }

    int getValue()
    {
        return x;
    }
    abstract public void reassign(int x);
}


class P extends C
{
    int x;
    P(int x)
    {
        super(x);
    }
    public void reassign(int x)
    {
        this.x=x;
    }

    @Override
    public int getValue() {
        System.out.println(super.getValue());
        return x;
    }
}

interface D
{
    int x=9;
    void getInt();
}
public class NewAbstractLearning {
    public static void main(String[] args) {
        P p=new P(5);
        System.out.println(p.getValue());
        p.reassign(10);
        System.out.println(p.getValue());
    }
}
