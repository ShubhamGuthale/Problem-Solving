class shape
{
    String color;
}
class Triangle extends shape
{
    public void Info()
    {
    System.out.println(color);
    }
}
public class dsa33 {
   public static void main(String args[])
   {
    Triangle t1=new Triangle();
    t1.color="red";
    t1.Info();
   } 
}
