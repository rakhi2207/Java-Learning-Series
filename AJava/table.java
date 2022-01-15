package AJava;

import javax.swing.*;
import java.awt.*;


public class table {
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("Table");
        JTable table;
        String[] header={"Name","Semester","Roll No"};
        String[][] a={
                {"Rakhi","3","1105"},
                {"Swati","3","1118"},
                {"Jiya","2","1086"}};
        table=new JTable(a,header);

        jf.add(table);
        jf.add(table.getTableHeader(), BorderLayout.NORTH);
        jf.add(table, BorderLayout.CENTER);

        jf.setSize(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }
}
