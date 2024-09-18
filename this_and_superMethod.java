<<<<<<< HEAD
class a
{
    public a()
     {
        super();
        System.out.println("in a");
    }
    public a(int n)
    {
        super();
        System.out.println("int a int");
    }
}
class b extends  a
{
    public b()
    {
        super();
        System.out.println("in b ");
    }
    public b(int n)
    {
    System.out.println("in b int");
    }
}
public class this_and_superMethod
{
    public static void main(String a[]) {
        b obj=new b(5);
    }
=======
class a
{
    public a()
     {
        super();
        System.out.println("in a");
    }
    public a(int n)
    {
        super();
        System.out.println("int a int");
    }
}
class b extends  a
{
    public b()
    {
        super();
        System.out.println("in b ");
    }
    public b(int n)
    {
    System.out.println("in b int");
    }
}
public class this_and_superMethod
{
    public static void main(String a[]) {
        b obj=new b(5);
    }
>>>>>>> d02ee67d8c18ccc625a2b925439bc6613f21e7ac
}