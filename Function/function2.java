import java.util.*;
public class function2 {
    public static void product(int a,int b){
        int pr= a*b;
        System.out.println("The product of the given number is "+pr);
        return;
   }
   public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter hte first number ");
    int a= sc.nextInt();
    System.out.println("Enter the second number " );
    int b = sc.nextInt();
    product(a, b);
   }
}
