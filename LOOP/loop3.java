import java.util.*;
public class loop3 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number to find the all previos even number ");
        int n= sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
