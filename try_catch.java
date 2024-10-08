
import java.util.Scanner;

public class try_catch{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            int num1=sc.nextInt();
            System.out.println("Enter the second number:");
            int num2=sc.nextInt();  
            int added=num1/num2;
            System.out.println("Result:"+ added);
        } catch (ArithmeticException e) {
                System.out.println("Error");
        }
    } 
}