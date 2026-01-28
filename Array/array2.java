import java.util.*;
public class array2 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the size of the array ");
        int size = sc.nextInt();
        int ar[]= new int[size];
        for (int i =0;i<size ;i++){
            System.out.println("Enter the "+ i+" Element");
            ar[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.println("The "+ i +" Element is "+ ar[i]);
        }
        sc.close();
    }
}
