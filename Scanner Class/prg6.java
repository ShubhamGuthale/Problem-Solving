import java.util.Scanner;

class prg6
{
    public static void main(String args[])
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = c.nextInt();
        System.out.println("Enter second number: ");
        int b = c.nextInt();
        int sum = a + b;
        System.out.println("your sum is : "+ sum);
    }
}
