//Write a program to take n integers from the user and store them in an array
import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the number of the element you want to enter ");
        int n= sc.nextInt();
        int arr[]= new int [n];
        for (int i =0;i<n;i++){
            System.out.print("Enter the "+i+" Element in the array");
            arr[i]=sc.nextInt();
            }
            for (int i =0;i<n;i++){
                
                    System.out.println("The "+i+" is "+arr[i]);
            }
            sc.close();
    }
}
