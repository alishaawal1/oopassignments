import java.util.Scanner;

public class robert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter marks of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter marks of 3rd Subject: ");
        double c = scanner.nextDouble();
        System.out.print("Enter marks of 4th Subject: ");
        double d = scanner.nextDouble();
        double total_marks;
        double percent;
        String rank;
        total_marks = a+b+c+d;
        System.out.println("The Total Marks is :" + total_marks);
        percent = total_marks/4;
        System.out.println("Total Percentage is :" + percent);
        rank = (percent>=70)?"First Class":
                (percent>59)?"Upper Second Class":
                        (percent>49)?"Second Class":
                                (percent>39)?"Third Class":"Failed";
        System.out.println("Your Grade is :" + rank);
    }
}
