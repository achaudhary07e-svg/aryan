import java.util.*;
public class function9 {
    public static void ageEligibility(int age ){
        if (age >=18){
            System.out.println("You are eligibe to vote");
        } else {
            System.out.println ("You are not eligible to vote");
        }
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner (System. in );
            System.out.println("Enter your age ");
            int age = sc.nextInt();
            ageEligibility(age);
            sc.close();
        }
}
