class human{
    private int age;
    private String name;

    public human()
    {
        age=12;
        name="john";
    }
    public human(int a,String n)
    {
    age=a;
    name=n;
    }
    public int getage()
    {
    return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
    this.name=name;
    }
}
public class demo
{
    public static void main (String a[]){
        human obj=new human();
        human obj1=new human(a:18,n:"navin");
        System.out.println(obj.getname() +":"+obj.getage());
         System.out.println(obj1.getname() +":"+obj1.getage());
    }
}