class student
{
    String name;
    int age;
    student() //Default Constructor
    {
        System.out.println("constructor called");
    }
}
public class DefaultConstructor{
    public static void main(String args[])
    {
        student s1=new student(); //when object created then constructer call automatically.
    }
}
