import java.util.*;
class prg8
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter position :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n)
        {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println("This is Your element : "+b);
    }
}
