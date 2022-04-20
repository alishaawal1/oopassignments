import java.util.Scanner;

public class UIOPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Enter a number:");

        int a = scanner.nextInt();
        System.out.println("enter second number:");
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);


        System.out.println("enter your name:");
        String a= scanner.nextLine();
        System.out.println("enter your age:");
        int b= scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter your address:");
        String c= scanner.nextLine();
        System.out.println("My name is " +a);
        System.out.println("My age is " +b);
        System.out.println("My address is " +c);
        */

        System.out.println("Enter principle:");
        String a = scanner.nextLine();
        System.out.println("Enter the rate:");
        String b = scanner.nextLine();
        System.out.println("Enter the time:");
        String c= scanner.nextLine();
        int val1= Integer.parseInt(a);
        int val2= Integer.parseInt(b);
        int val3=Integer.parseInt(c);
        double s=(val1*val2*val3)/100;
        System.out.println("the simple interest is:" +s);
    }
}
