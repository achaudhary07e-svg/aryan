import java.util.*;
public class function3 {
    public static void even(int n){
        if (n%2==0){
            System.out.println("The number is even ");
        }  else{
            System.out.println("The number is not even ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to check if it is even or not ");
        int n = sc.nextInt();
        even(n);
    }
}
