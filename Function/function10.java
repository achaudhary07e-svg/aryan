import java.util.*;
public class function10 {
    public static void number(){
        Scanner sc= new Scanner (System.in);
        int positivecount=0, negative=0, zero=0;
        char choice;
        
        do {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n >0){
                positivecount++;
            } else if (n<0) {
                negative++;
            } else{
                zero++;
            }
            System.out.println ("Want to continue ?......(y/n)");
            choice = sc.next().charAt(0);
        } while(choice == 'y' || choice == 'Y');

        System.out.println("The total positives are"+ positivecount);
        System.out.println("The total negatives are "+ negative);
        System.out.println("The total zeroes are "+ zero );
    }
    public static void main(String[] args) {
       
       number();

    }
}
