// Write a program to find the average of array elements
import java.util.*;
public class array6 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
          System.out.print("Enter the number of the element you want to enter ");
        int n= sc.nextInt();
        int rev=0;
        double avg=0;
        int arr[]= new int [n];
        for (int i =0;i<n;i++){
            System.out.print("Enter the "+i+" Element in the array");
            arr[i]=sc.nextInt();
            }
            for (int i =0;i<n;i++){
               rev = rev +arr[i];
               avg = rev/n;
            }
            System.out.println("The average of the entered matrix is " + avg );
            sc.close();
    }
}
