package AJava;

import javax.swing.*;
import java.awt.*;


public class login {
    public static void main(String[] args)
    {
        String[] cat={"Student","Teacher"};
        JFrame jf=new JFrame("Login");
        jf.setLayout(new GridLayout(4,2));
        JLabel l=new JLabel("Username");
        JTextField jt=new JTextField();
        JLabel l2=new JLabel("Password");
        JTextField jt2=new JTextField();
        JLabel l3=new JLabel("Category");
        JButton b=new JButton("Submit");
        JButton b1=new JButton("Reset");
        JComboBox j1=new JComboBox(cat);
        j1.setSelectedIndex(-1);
        jf.add(l);
        jf.add(jt);
        jf.add(l2);
        jf.add(jt2);
        jf.add(l3);
        jf.add(j1);
        jf.add(b);
        jf.add(b1);
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

    }

}
