import  java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ar[]= new int [7];
        int i ;
        for (i =0;i<7;i++){
            System.out.println("Enter the "+ i+" Element");
            ar[i]=sc.nextInt();
        }
        for (i=0;i<7;i++){
            System.out.println("The "+ i +" Element is "+ ar[i]);
        }
    }
}
