//Input a string from the user. Create a new string called ‘result’ 
// in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”
import java.util.*;
public class string2 {
public static void  main (String args []){
    Scanner sc = new Scanner (System.in);
    String name;
    System.out.print("Enter the String ");
    name = sc.nextLine();
    String result ="";
    for (int i =0 ; i <name.length();i++){
        if (name.charAt(i)=='e'||name.charAt(i)=='E'){
            result+='i';
        } else 
        {
            result+=name.charAt(i);
        }
        }
        System.out.println(result);
        sc.close();
}    
}
