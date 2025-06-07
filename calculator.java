import java.util.Scanner;
class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number a:");
        double a=sc.nextInt();
        System.out.print("Enter a number b:");
        double b=sc.nextInt();
        System.out.print("Enter a operator(/,*,-,+):");
        char operator=sc.next().charAt(0);
        double result;
        switch(operator){
        case '+':
            result=a+b;
            System.out.print("Addition is:"+result);
            break;
        case '-':
            result=a-b;
            System.out.print("Subtraction is:"+result);
            break;
        case '/':
            if(b!=0){
            result=a/b;
            System.out.print("Division is:"+result);}
            else{
                System.out.print("Cannot divide with 0");
            }
            break;
        case '*':
            result=a*b;
            System.out.print("Multiplication is:"+result);
            break;
        default:System.out.println("Invalid number entered:");
    }
        sc.close();
    }
}