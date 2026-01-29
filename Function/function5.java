import java.util.*;
public class function5{
    public static void average(int a, int b, int c){
        float avg= (a+b+c)/3;
        System.out.println("The average of the number is "+ avg);
    }
    public static void main (String arga[]){
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter the first number ");
        int a= sc.nextInt();
        System.out.print("Enter the first number ");
        int b= sc.nextInt();
        System.out.print("Enter the third number ");
        int c= sc.nextInt();
        average(a, b, c);
        sc.close();
    }
}