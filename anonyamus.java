class A
{
    public A()
    {
        System.out.println("yes im in");
    }
    public void show()
    {
        System.out.println("no im not");
    }
}
public class anonyamus{
public static void main(String a[])
{
    new A().show();/*in this case we will create a new object as
    A age=new A();
    age.show();
    we dont need to create a new object and aggign*/
   
}
}