//Define a class Car with attributes like make, model, and year. Create a method to display the car details and test it in the main method.
public class car{
    //have to define attributes make,model,year
private String make;
private String model;
private int year; 
//initilize constructor
public car(String make,String model,int year){
this.make=make;
this.model=model;
this.year=year;
}
public void displaydetails(){
System.out.println("car make:"+make);
System.out.println( " car model:"+model);
System.out.println("car year:"+year);
}
public static void main(String[] a){
    car n=new car("toyoto","camry",2020);
    n.displaydetails();
}
}
