//program for give two number from user return addition of two number

import java.util.Scanner;

public class dsa3 {
    public static void main(String[] args) 
    {
        sum();
    }
    static void sum()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=in.nextInt();
        System.out.println("Enter Second number : ");
        int b=in.nextInt();
        int c;
        c=a+b;
        System.out.println("Sum is :" +c);
    }
    
}
