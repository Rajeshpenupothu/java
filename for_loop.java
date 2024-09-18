
import java.util.Scanner;

public class for_loop
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to be printed:");
        int number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }
}