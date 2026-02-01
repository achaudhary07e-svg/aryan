//Write a program to find the largest element in a 2D array.
import java.util.*;
public class array20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the columns  ");
        int col = sc.nextInt();
        System.out.print("Enter the size of the rows");
        int row =sc.nextInt();
        int arr [][]= new int [col][row];
        System.out.println("Enter the elements in the Matrix");
         for (int i =0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print("a "+i+" "+j+" ");
                arr[i][j]=sc.nextInt();
            }
         }
          for (int i =0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
         int max=arr[0][0];
         for (int i =0;i<col;i++){
            for (int j=0;j<row;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
         } 
         System.out.println("The largest element in the matrix is "+max);
         sc.close();
    }
}
