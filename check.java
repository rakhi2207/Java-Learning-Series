import java.util.ArrayList;


class sys
{
    int x=10;
}
class ch extends sys
{
    final int x=20;
    public int getX()
    {
        return x;
    }
}

public class check
{
    public static void main(String[] args) {
        System.out.println(new ch().getX());
        System.out.println(new ch().x);
    }
}
