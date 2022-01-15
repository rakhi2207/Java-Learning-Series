package AJava;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


class Student
{
    private String name;
    private int rollno;
    static ArrayList<Student> removed=new ArrayList<>();
    private int marks;

    Student(String name,int rollno,int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public boolean equals(Object o) {
        Student stu=(Student) o;
          if(this.rollno==stu.rollno)
          {
              removed.add(stu);
          }
        return this.rollno==stu.rollno;
    }

    @Override
    public int hashCode() {
        return rollno;
    }

    @Override
    public String toString()
    {
        return name+","+rollno;
    }

    static public ArrayList<Student> getSamedat()
    {
        return removed;
    }

    public static Character getGrade(int marks)
    {
        if(marks>=60)
        {
            return 'A';
        }else if(marks<60 && marks>40)
        {
            return 'B';
        }else
        {
            return 'C';
        }
    }

    public int getMarks() {
        return marks;
    }
}
public class RollnoNotSame {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<>();
        HashMap<Integer,Character> val=new HashMap<>();
        h.add(new Student("Avinash",12,70));
//        val.put()
        h.add(new Student("Avinash",11,50));
        h.add(new Student("Avinash",12,60));
        h.add(new Student("Avinash",10,50));

        Iterator it=h.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Removed Element");
     Iterator itr=Student.getSamedat().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }

}
