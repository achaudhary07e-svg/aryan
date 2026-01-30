//Write a program to search an element in an array
import java.util.*;
public class array11 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the size of the array ");
     int size = sc.nextInt();
    int arr[]=   new int  [size];
    for(int i = 0; i <size ; i++){
        System.out.print("Enter the "+ i +" Elements ");
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the element to search it and print its index value ");
    int ele= sc.nextInt();
    for (int i =0; i<size;i++){
        if (ele==arr[i]){
            System.out.println("The Index value of the element is "+i);
                }else ;
    }
    sc.close();

    }
}
