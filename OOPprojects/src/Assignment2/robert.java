package Assignment2;

import javax.swing.*;

public class robert {
    public static void main(String[] args) {
        double mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 1st Subject"));
        double mark2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 2nd Subject"));
        double mark3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Mark of 3rd Subject"));
        double total_mark = mark1+mark2+mark3;
        double percentage = total_mark/3;
        int total = (int)total_mark;
        int per = (int)percentage;
        JOptionPane.showMessageDialog(null,"Total mark: "+total+" \n Percentage: "+per + "%");
    }
}
