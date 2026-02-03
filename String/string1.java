//Take an array of Strings input from the user
//  & find the cumulative (combined) length of all those strings.
import java.util.*;
public class string1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in );
    String name ;
    System.out.print("Enter the Name of the student ");
    name=sc.nextLine();
    System.out.println("The total length of the string is "+ name.length());
    sc.close();
}    
}
