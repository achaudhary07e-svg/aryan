import java.util.*; 
public class string4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in );
    
    String res="";
    System.out.println("Enter the strings  ");
    String name = sc.nextLine();
    for (int i =name.length() ; i>=0;i--){
     res+=name.charAt(i);
    }
    System.out.println(res);
    sc.close();
}    
}
