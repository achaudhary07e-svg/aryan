//Write a program to find the maximum element in an array.
import java.util.*;
public class array7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
         System.out.print("Enter the number of the element you want to enter ");
        int n= sc.nextInt();
        
        int arr[]= new int [n];
        for (int i =0;i<n;i++){
            System.out.print("Enter the "+i+" Element in the array");
            arr[i]=sc.nextInt();
            }
            int max = arr[0];
            for (int i =0;i<n;i++){
             if (max<arr[i]){
                max=arr[i];
             }   
            }
            System.out.println("The Maximum value of the aray is "+ max);
            sc.close();
    }
}
