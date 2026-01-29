import java.util.*;
public class function4 {
    public static void table(int n){
        int table=1 ;
        for(int i =1; i<=10;i++){
            table= i*n;
            System.out.println(n+" X "+i+" = "+table);
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to find the table of the number");
        int n = sc.nextInt();
        table(n);
        sc.close();
    }
}
