import java.util.*;
public class function7 {
    public static void greater (int a, int b){
        if (a>b){
            System.out.println("The first number entered is the greatest ");
        } else {
            System.out.println("The second number entered is the greatest ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in );
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        System.out.print("Enter  the second number = ");
        int b = sc.nextInt();
        greater(a, b);
        sc.close();
    }
}
