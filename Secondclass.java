import java.util.*;
class Secondclass{
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name of the student");
        String name= sc.nextLine();
        System.out.println("Enter the age of the student");
        int age=sc.nextInt();
        System.out.println("Enter the marks of the student");
        float marks=sc.nextInt();
        System.out.print("The name of the student is ");
        System.out.println(name);
        System.out.print("The age of the student is ");
        System.out.println(age);
        System.out.print("The marks of the student is ");
        System.out.println(marks);
sc.close();
    }
}