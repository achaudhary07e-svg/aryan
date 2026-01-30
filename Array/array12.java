//Write a program to copy elements from one array to another.
import java.util.*;
public class array12 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        int brr[]=new int[size];

        System.out.println("Enter the elements in the array");
        for(int i =0 ; i<size ;i++){
            System.out.print("a "+i+" = ");
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<size ; i++){
            brr[i]=arr[i];
        }
        System.out.println("The copied element in the second element is");
        for(int i =0;i<size ; i++){
        System.out.println("b "+i+" "+ brr[i]);
        }
        sc.close();
    }
}
