import java.util.*;

public class loop1 {
public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter the number to find the sum of all naturl number ");
    int n= sc.nextInt();
    int i ;
    int sum=0;
    for (i= 0 ; i<=n;i++){
        sum = sum +i;

    }
    System.out.print("The sum of the natural number is "+sum);
sc.close();
}    
}
