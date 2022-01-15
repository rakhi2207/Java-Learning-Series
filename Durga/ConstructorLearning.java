package Durga;

public class ConstructorLearning {

    //It will be treated as method not as constructor
    int ConstructorLearning()
    {
        System.out.println("Method but not constructor");
        return 10;
    }

    public static void main(String[] args) {
        ConstructorLearning c=new ConstructorLearning();
        System.out.println(c.ConstructorLearning());
    }
}
