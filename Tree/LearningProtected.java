package Tree;

import Durga.A;
public class LearningProtected extends A {
    public static void main(String[] args) {

        //Protected function can only be accessed through child class reference
        LearningProtected a=new LearningProtected();
        a.m1();
//        A s=new A();
//        s.m1();
    }
}
