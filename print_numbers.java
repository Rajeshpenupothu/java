
import java.util.Scanner;

public class print_numbers{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for(int i=num;i>=0;i--){
            System.out.println(i);
        }
    }
}