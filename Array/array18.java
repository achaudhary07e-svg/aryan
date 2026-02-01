//Write a program to find the row-wise and column-wise sum of a matrix
import java.util.*;
public class array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
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
       
        //Second Array
         int brr[][]=new int[col][row];
        System.out.println("Enter the elements of the array ");
        for(int i = 0;i<col;i++){
            for (int j=0;j<row;j++){
            System.out.print("a "+i+j+" = ");
            brr[i][j]=sc.nextInt();
            }
        }
       
        //Sum 
        int sum[][]=new int[row][col];
        int sum2[][]=new int[row][col];
        System.out.println("Enter the elements of the array ");
        for(int i = 0;i<col;i++){
            for (int j=0;j<row;j++){
           sum[j]=arr[j]+brr[j];
            }
        }
         System.out.println("Enter the elements of the array ");
        for(int i = 0;i<col;i++){
            for (int j=0;j<row;j++){
           sum2[i][]=arr[i][]+brr[i][];
            }
        }
         for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
         for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(brr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("The sum of the rows are ");
        for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(sum[i]+"  ");
            }
            System.out.println();
        }
        System.out.println("The sum of columns are ");
        for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(sum2[j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
