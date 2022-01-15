package Durga;


class Check
{
    static
    {
        System.loadLibrary("/home/rakhi/Documents/c++/Arrays/FirstRepeatingElement.cpp");
    }

    public native void m1();
}
public class Native {
    public static void main(String[] args) {
        Check c=new Check();
        c.m1();
    }
}

