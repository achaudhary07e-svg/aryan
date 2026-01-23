import java.util.*;
public class condition2 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        char button= sc.next().charAt(0);
        int b= sc.nextInt();
        switch(button){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default: System.out.println("Invalid operation you have performing or entered the value in wrong way please check it and correct your entered value");

        }
    }
}
