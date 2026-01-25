
import java.util.*;

public class function1 {

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " + " + b + " is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        sum(a, b);
        sc.close();
    }
}
