//program using function

import java.util.Scanner;

class prg14
{
    public static void main(String[] args) 
    {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter name :");
     String name = in.nextLine();
    fun(name);
    }
     static void fun(String a)
    {
         System.out.println("This is your enter string : "+a);
    
     }
    
}
