package Assignment2;

import javax.swing.*;

public class studentdetails {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        String address = JOptionPane.showInputDialog("Enter Your Roll No.");
        Integer age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Interest"));

        JOptionPane.showMessageDialog(null,"Name :" + name + "\n Roll :" + age + "\n Interest :"+address);

        System.exit(0);
    }
}
