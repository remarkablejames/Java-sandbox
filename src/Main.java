import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        c = a + b;
        System.out.println("The sum of the two numbers is: " + c);

    }
}

