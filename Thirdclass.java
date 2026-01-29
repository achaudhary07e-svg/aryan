import java.util.*;
public class Thirdclass {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print ("Enter the radius of the circle");
    int r=sc.nextInt();
    double a=3.14*r*r;
    System.out.println("The area of the circle is ");
    System.out.print(a);
    sc.close();
}
}
