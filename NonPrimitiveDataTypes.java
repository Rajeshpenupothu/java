public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str ="test";
        System.out.println("string is"+str);
        String str1 =new String("test");
        System.out.println("new string is"+str1);
        int arr[];
        arr=new int[3];
        arr[0]=7;
        arr[1]=9 ;
        arr[2]=2;
        System.out.println(arr);
        System.out.println(arr[0]);
        }
}