import java.util.Scanner;

public class squarenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int a = scanner.nextInt();
        int square = a*a;
        System.out.println("The square of number is: "+square);
    }
}
