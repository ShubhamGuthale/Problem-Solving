//Method overloading

class student
{
    String name;
    int age;
    public void Info(int age) 
    {
        System.out.println(this.age);
    }
    public void Info(int age,String name) 
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void Info(String name) 
    {
        System.out.println(this.name);
    }
}
public class dsa32{
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="Shubham";
        s1.age=22;
        s1.Info(s1.age);
    }
}
