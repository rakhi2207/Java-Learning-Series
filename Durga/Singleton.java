package Durga;


class single
{
    private single()
    {

    }

    private static single s=null;
    public static single getSingletonClass()
    {
        if(s==null)
        {
            s=new single();
        }
        return s;
    }
}
public class Singleton {
    public static void main(String[] args) {
        single s=single.getSingletonClass();
    }
}


