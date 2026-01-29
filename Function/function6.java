import java.util.*;
public class function6 {
    public static void takeNumber(int n){
        int sum=0;
        for (int i = 1;i <=n;i++){
            if (n%2!=0){
                sum = sum +n;
            } 
        }
            System.out.println("The sum of all the odd number in the given number is "+ sum);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find the sum of all odd numbers ");
        int n = sc.nextInt();
        takeNumber(n);
        sc.close();
    }
}
