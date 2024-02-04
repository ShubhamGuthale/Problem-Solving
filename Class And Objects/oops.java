class pen
{
    String color;
    String type; //gel,marker
    public void display()
    {
        System.out.println("Color is : "+ color +", Type is : "+type);
    }
}
public class oops {
    public static void main(String args[])
    {
        pen p1=new pen();  //object creation
        p1.color="blue";
        p1.type="gel";
        p1.display(); //method call
    }
    
}
