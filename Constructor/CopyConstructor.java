class student
{
    String name;
    int age;

    student(student s2) //Copy Constructor
    {
        this.name=s2.name;
        this.age=s2.age;
    }
    public void Info() //method
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student() //empty
    {

    }
}
public class CopyConstructor{
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="Shubham";
        s1.age=22;
        student s2=new student(s1); //pass s1 object
        s2.Info();
    }
}
