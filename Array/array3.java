import java.util.*;
public class array3 {
 public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter the size of the array ");
        int size = sc.nextInt();
        int ar[]= new int[size];
        for (int i =0;i<size ;i++){
            System.out.println("Enter the "+ i+" Element");
            ar[i]=sc.nextInt();
        }
        System.out.println ("Enter the element to know its index value ");
        int x= sc.nextInt();
        for (int i=0;i<size;i++){
            if (ar[i]==x){
                System.out.println("The Index value of your ("+x+") is in the index value of "+i);
            }         
        }
        sc.close();
 }   
}
