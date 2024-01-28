import java.util.Scanner;

public class dsa8 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter size : ");
    int size=in.nextInt();
    int [] arr=new int[size];
   // int arr[]=new int[20]; declare in another format
   System.out.println("enter arrays element: ");
    for(int i=0;i<size;i++)
    {
    arr[i]=in.nextInt();
    }
    System.out.println("Array element are : ");
    for(int i=0;i<size;i++)
    {
    System.out.println(arr[i]);
    }
}    
}
