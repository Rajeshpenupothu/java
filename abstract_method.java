abstract class abstract_method{
    public abstract void drive();
    {
        System.out.println("driving..");
    }
    abstract class Wagnor extends abstract_method{
        public abstract  void drive();
        {
            System.out.println("Flying..");
        }
    }
    public static void main(String[] args) {
        abstract_method obj=new abstract_method();
        obj.drive();
     
    }
}