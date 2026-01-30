//Write a program to sort an array in descending order.
import java.util.*;
public class array14 {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the element in the array ");
        for (int i=0;i<size;i++){
           System.out.print("a "+i+" = ");
           arr[i]=sc.nextInt();
        }
        int a=0;
        System.out.println("The Entered elements are ");
        for (int i =0; i <size; i++){
            System.out.println("a "+i+" = "+ arr[i]);
        }
        for (int i = 0 ; i<size;i++){
            for (int j=0;j<size;j++){
            if (arr[i]>arr[j]){
                a=arr[j];
                arr[j]=arr[i];
                arr[i]=a;
            }
        }
        }
        System.out.println ("The Dscending order is ");
        for (int i = 0 ; i<size;i++){
            System.out.println("a "+i+" = "+ arr[i]);
        }
        sc.close();
    }
}
