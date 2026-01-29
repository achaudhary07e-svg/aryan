//Write a program to count even and odd numbers in an array.
import java.util.*;
public class array9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
         System.out.print("Enter the number of the element you want to enter ");
        int n= sc.nextInt();
        
        int arr[]= new int [n];
        for (int i =0;i<n;i++){
            System.out.print("Enter the "+i+" Element in the array");
            arr[i]=sc.nextInt();
            }
           int countodd=0, counteven=0;
            for (int i =0;i<n;i++){
              if (arr[i]%2==0){
                counteven++;
              }   else{
                countodd++;
              }
            }
            System.out.println("The total odd numbers are "+ countodd);
            System.out.println("The total even numbers are "+ counteven);
            sc.close();
}
}