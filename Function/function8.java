import java.util.*;
public class function8 {
    public static double circumference(int r ){
        double c= 2 * 3.14 * r;
        System.out.println("The Circumferece of the circle is "+ c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        System.out.println("Enter the radius of the circle ");
        int r = sc.nextInt();
        circumference(r);
        sc.close();
    }
}
