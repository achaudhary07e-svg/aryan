//Write a program to print the diagonal elements of a matrix.
import java.util.*;
public class array22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
         for(int i =0;i<col;i++){
            for (int j =0 ;j<row;j++){
                if (i==j){
                    System.out.println("a "+i+" "+j+" = "+arr[i][j]);
                }
            }
         }
         sc.close();
    }
}
