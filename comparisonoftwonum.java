
import java.util.Scanner;
public class comparisonoftwonum{
    public static void main(String args[]) {
        Scanner a= new Scanner(System.in);
        int number1;
        int number2; 
        System.out.print("Input first integer: ");
        number1 =a.nextInt(); 
        System.out.print("Input second integer: ");
        number2 = a.nextInt(); 
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}