import java.util.*;
public class loop2{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to  find its table ");
        int n=sc.nextInt();
        int i;
        for (i = 1;i<=10;i++){
            System.out.println(n+"X"+i+"="+i*n);
        }
    }
}
