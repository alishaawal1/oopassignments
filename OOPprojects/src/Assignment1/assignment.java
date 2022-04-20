import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String a = scanner.nextLine();
        System.out.println("Enter your roll number:");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your address:");
        String d = scanner.nextLine();
        System.out.println("Enter your seat number:");
        int s = scanner.nextInt();
        String result;
        result = (b >= 80) ? "distinction" :
                (b > 69 && b < 80) ? "first Class" :
                        (b > 49 && b < 69) ? "Second Class" :
                                (b > 39 && b < 49) ? "Third Class" : "Failed";
        System.out.println("Your grade is " + result);
    }
}