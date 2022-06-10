import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

class Vehicle{
    void print(){
        System.out.print("Vehicle class");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.print("Car class ");
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();
//        try(FileReader f=new FileReader("abc.txt");)
//        {
//
//        }
    }
}
