
import java.util.Scanner;

public class time{
    public static String reverseString(String []str){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String a=sc.nextLine();
        System.out.println("Reversed stringz:"+a);
        char [] charArray=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
        }
        return new String(charArray);
            }
}