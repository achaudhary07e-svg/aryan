// Write a program to add two matrices
import java.util.*;
public class array16{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
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
        //Second Array
         int brr[][]=new int[col][row];
        System.out.println("Enter the elements of the array ");
        for(int i = 0;i<col;i++){
            for (int j=0;j<row;j++){
            System.out.print("a "+i+j+" = ");
            brr[i][j]=sc.nextInt();
            }
        }
        for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(brr[i][j]+"  ");
            }
            System.out.println();
        }
        //Sum 
        int sum[][]=new int[col][row];
        System.out.println("Enter the elements of the array ");
        for(int i = 0;i<col;i++){
            for (int j=0;j<row;j++){
           sum[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for (int i =0;i<col;i++){
            for (int j = 0;j<row;j++){
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}