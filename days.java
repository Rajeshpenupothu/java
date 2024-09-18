
import java.util.Scanner;

public class days{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("select one day (1-7)");
        int daynumber= scanner.nextInt();
        String day;
        switch (daynumber){
            case 1:
                day="sunday";
                break;
            case 2:
                day="Monday";
                break;
            case 3:
                day="Tuesday";
                break;
            case 4:
                day="Wednesday";
                break;
            case 5:
                day="Thursday";
                break;
            case 6:
                day="Friday";
                break;
            case 7:
                day="Saturday";    
                break;    
                default:
                day = "Invalid day number! Please enter a number between 1 and 7.";
                break;
        }
        System.out.println(day);
}}