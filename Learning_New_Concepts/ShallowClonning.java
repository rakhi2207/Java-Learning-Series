package Learning_New_Concepts;

class Cat
{
    int j;
    Cat(int j)
    {
        this.j=j;
    }
}
class Test implements Cloneable
{
    int i;
    Cat c;
    Test(Cat c,int i)
    {
        this.c=c;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

//Deep Copy
class Test1 implements Cloneable
{
    int i;
    Cat c;
    Test1(Cat c,int i)
    {
        this.c=c;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException
    {
        Cat x=new Cat(c.j);
        Test1 t1=new Test1(x,i);
        return t1;
    }
}

public class ShallowClonning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Cat c=new Cat(10);
        Test t1=new Test(c,10);
        System.out.println(t1.i+" "+t1.c.j);
        Test t2=(Test)t1.clone();
        t2.c.j=888;
        t2.i=999;
        System.out.println(t1.i+" "+t1.c.j);

        Cat c2=new Cat(100);
        Test1 t3=new Test1(c2,100);
        System.out.println("Test1 "+t3.i+" "+t3.c.j);
        Test1 t4=(Test1)t3.clone();
        t4.c.j=900;
        System.out.println("Test1 "+t3.i+" "+t3.c.j);
        System.out.println("Test1 t4 "+t4.i+" "+t4.c.j);
    }
}
