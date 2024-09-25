
import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit to print prime numbers:");
        int limit=scanner.nextInt(); 
        for (int num=2;num<limit;num++){
            if(isPrime(num)){
                System.out.println(num +" ");
        }
    }
    }

    public static boolean isPrime(int number) {
        if(number<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(number);i++){
            if(number % i ==0){
                return false;
            }
        }
    return true;
    }
}
