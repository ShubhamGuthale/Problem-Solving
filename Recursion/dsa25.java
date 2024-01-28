//Q.Print a string in reverse using recursion.
//Time Complexity ---> O(n)
import java.util.*;
public class dsa25 {
    public static void printrev(String str,int idx)
    {
        if(idx==0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String str=sc.nextLine();
        printrev(str,str.length()-1);
    }
    
}
