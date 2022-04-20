package Assignment2;

import javax.swing.*;

public class linestring {
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Enter 1st String");
        String str2 = JOptionPane.showInputDialog("Enter 2nd String");
        String combined_str = str1+str2;
        JOptionPane.showMessageDialog(null,combined_str);
    }
}
