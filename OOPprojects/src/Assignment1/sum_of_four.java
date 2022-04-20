import java.util.Scanner;

public class sum_of_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Enter third number:");
        int c = scanner.nextInt();
        System.out.println("Enter fourth number:");
        int d = scanner.nextInt();
        int e = a+b+c+d;
        System.out.println("the sum of four numbers is " +e);
    }
}
