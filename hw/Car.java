import java.util.*;

class Car
{
    Scanner sc = new Scanner(System.in);
    int modelyear;
    String type;
    int speed;
    

    public void accept()
    {
        modelyear = sc.nextInt();
        type = sc.next();
        speed = sc.nextInt();
    
    }

    public void display()
    {
        System.out.println("car model year" +modelyear+ " car type" +type+ "car speed" +speed );
    }
}

class Animal
{
    Scanner sc = new Scanner(System.in);
    String name;
    double population;
    

    public void accept()
    {
        name = sc.next();
        population = sc.nextDouble();
    
    }

    public void display()
    {
        System.out.println("Animal name" +name + " Animal Population" +population );
    }
}
class Emp
{
    Scanner sc = new Scanner(System.in);
    int empid;
    String empname;
    String dept;
    

    public void accept()
    {
        empid = sc.nextInt();
        empname = sc.next();
        dept = sc.next();
    
    }

    public void display()
    {
        System.out.println("Employee id" +empid+ " Employee name" +empname+ "Employee department" +dept );
    }
}
