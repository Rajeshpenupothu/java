
import java.util.Scanner;

public class reverse_string{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.nextLine();
        String reverse="";
        for(int i=str.length()-1;i >=0;i--){
            reverse +=str.charAt(i);
        }
        System.out.println("Rversed string :"+reverse);
    }
}