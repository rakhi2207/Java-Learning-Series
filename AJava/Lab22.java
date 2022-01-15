package AJava;

import java.util.Scanner;
public class Lab22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No Of Manager: ");
        int mgrCount = scanner.nextInt();
        System.out.println();
        int highestSalIndex = 0;
        Manager[] mgrList = new Manager[mgrCount];
        for (int i = 0; i < mgrCount; i++) {
            System.out.println("Enter details of Mgr" + (i+1) + ": ");
            mgrList[i] = new Manager();
            mgrList[i].accept();
            System.out.println();
        }
        for (int i = 0; i<mgrCount;i++){
            if (mgrList[i].totalSal()>mgrList[highestSalIndex].totalSal()){
                highestSalIndex = i;
            }
        }
        System.out.println("Highest Paid Manager: ");
        mgrList[highestSalIndex].display();
        System.out.println("Total Sal: "+(mgrList[highestSalIndex]).totalSal());
    }
}
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter dept: ");
        this.department = scanner.nextLine();
        System.out.println("Enter salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine();
    }
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + department);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    private double bonus;
    public Manager() {
    }
    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bonus: ");
        this.bonus = scanner.nextDouble();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }
    public double totalSal(){
        return (this.bonus+super.getSalary());
    }
}

