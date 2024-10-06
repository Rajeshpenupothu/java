import java.util.Scanner;
public class numbers{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
            
        }
    }
}