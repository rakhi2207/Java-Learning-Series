package Practice;


class Students
{

}

class Teacher extends Students
{

}
public class newVsnewInstance {
    public static void main(String[] args) throws Exception{

        Thread t=new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t));

    }
}
