//take array from user and display it

import java.util.Scanner;

public class dsa9 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter size : ");
    int size=in.nextInt();
    int [] arr=new int[size];
   System.out.println("enter arrays element: ");
    for(int i=0;i<size;i++)
    {
    arr[i]=in.nextInt();
    }
    System.out.println("enter element : ");
    int x=in.nextInt();
    for(int i=0;i<arr.length;i++)
    {
    if(arr[i]==x)
    {
        System.out.println("Element found index : " +arr[i]);
    }
    }
}    
}
