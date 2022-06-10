package AJava;

import java.io.*;
import java.sql.*;

public class ImageLearningDemo {
    public static void main(String[] args) throws SQLException, IOException
    {
        File f=new File("/home/rakhi/Documents/IdeaProjects/Learning Java/src/AJava/Rakhi jha.jpeg");
        FileReader f1=new FileReader("/home/rakhi/eclipse-workspace/Learning JDBC/src/a.txt");
        System.out.println(f.exists());
        FileInputStream fis=new FileInputStream(f);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Rakhi_Practice","root","Aditi@123");
        PreparedStatement ps=con.prepareStatement("Insert into Image Values(?,?)");
        ps.setString(1,"Rakhi");
        ps.setBinaryStream(2, fis);
        //ps.setClob(3, f1);
        ps.executeUpdate();
    }
}
