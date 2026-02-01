//Write a program to find the sum of all elements in a 2D array.
import java.util.*;
public class array21 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in );
        System.out.println("Enter the size of the rows ");
        int row=sc.nextInt();
        System.out.println("Enter the size of the columns ");
        int col=sc.nextInt();
        int arr[][]=new int[col][row];
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
         int res=0;
         for (int i =0 ; i<col;i++){
            for (int j=0;j<row;j++){
                res=res+arr[i][j];
            }
         }
         System.out.println("The sum of the all elements are "+ res);
         sc.close();
    }
}
