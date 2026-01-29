//Write a program to print array elements in reverse order
import java.util.*;
public class array10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number of the element you want to enter ");
        int n= sc.nextInt();
        
        int arr[]= new int [n];
        int brr[]=new int[n];
        for (int i =0;i<n;i++){
            System.out.print("Enter the "+i+" Element in the array");
            arr[i]=sc.nextInt();
            }
            for (int i =0;i<n;i++){
                brr[i] = arr[n - 1 - i];
            }
            for (int j =0;j<=n;j++){
                System.out.println("The reversed array is "+ brr[j]);
            }
            sc.close();
    }
}
