public class array_try_catch{
    public static void main(String a[]){
        int[] numbers={1,2,3,4,5};
        try {
            int value=numbers[5];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Error:Array index out of bounds");
        }
    }
}