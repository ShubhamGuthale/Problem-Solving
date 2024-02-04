class student
{
    String name;
    int age;
    student(String name,int age) //Parameterized Constructor
    {
        this.name=name;
        this.age=age;
    }
    public void Info() //method
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class ParameterizedConstructor{
    public static void main(String args[])
    {
        student s1=new student("shubham",22); //parameter pass
        s1.Info();
    }
}
