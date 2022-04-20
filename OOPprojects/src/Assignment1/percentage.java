import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter marks of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter marks of 3rd Subject: ");
        double c = scanner.nextDouble();
        double total_mark;
        double percentage;
        total_mark = a+b+c;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/3;
        System.out.println("Total Percentage is :" + percentage);
    }
}
