package Doubt;

abstract class hello
{
    private String i;
    hello(String s)
    {
        i=s;
    }
    public String getHello()
    {
        return i;
    }
}
class JiyaDoubt1 extends hello
{
    int i=0;
    JiyaDoubt1(int x)
    {
        super("Robert");
        x=i;
    }
    public static void main(String[] args) {

    }
}
