import java.util.*;
public class sixth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number ");
        int a= sc.nextInt();
        System.out.println("Enter the Second number ");
        int b= sc.nextInt();
        if (a==b)
        {
            System.out.println("The entered value are same check the given number");
            System.out.print("The first number is ");
            System.out.println(a);
            System.out.print("The second number is ");
            System.out.println(b);
        }
        else if (a<b)
        {
            System.out.println("B is the greatest number ");
        }
        else
        {
            System.out.println("A is the Greatest number  ");
        }
        sc.close();
    }
}
