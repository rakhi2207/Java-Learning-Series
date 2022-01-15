package Durga;

class Ab
{
    Ab(int i)
    {
        System.out.println("int args");
    }
}

class bc extends Ab
{
    bc(int i)
    {
        super(10);
        System.out.println("child int args");
    }
}
public class OverloadedConstructor {
    public static void main(String[] args) {
        bc b=new bc(1);
    }
}
