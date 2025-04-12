import java.util.*;
public class dsa82 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size:");
    int size=sc.nextInt();
    int num[]=new int[size];
    System.out.println("enter element:");
    for(int i=0; i<size; i++)
    {
      num[i]=sc.nextInt();
    }
    System.out.println("your array is :");
    for(int i=0;i<size; i++)
    {
      System.out.println(num[i]);
    }
  }
}
