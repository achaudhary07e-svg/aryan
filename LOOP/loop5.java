import java.util.*;
public class loop5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n ; 
        do { 
            System.out.println("Enter the marks you want to give ");
            int m= sc.nextInt();
            if(m>=90){
                System.out.println("This is good ");
            }
            else if (m<=89 && m >=60){
                System.out.println("This is also Good ");
                }
                else if(m<=59 && m>=0){
                    System.out.println("This is Good as well");
                }
                System.out.println("Want to continue :(Yes[1] or No [0]) ");
                n= sc.nextInt();
            }
        while (n==1);
            
        
        }

    }

