//Write a program to print a 2D array (matrix)
import java.util.*;
public class array17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows ");
        int row=sc.nextInt();
        System.out.print("Enter the size of columns");
        int col=sc.nextInt();
        int arr[][]=new int[col][row];
        System.out.println("Enter the elements of the array ");
        for(int i = 0;i<col;i++){
            for (int j=0;j<row;j++){
            System.out.print("a "+i+j+" = ");
            arr[i][j]=sc.nextInt();
            }
        }
        for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
