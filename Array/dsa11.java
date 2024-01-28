//take array from user and delete element in perticular position display it


import java.util.Scanner;

public class dsa11 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter size of array : ");
    int size=in.nextInt();
    int [] arr=new int[size];
    int [] arr2=new int[size-1];

   System.out.println("enter arrays element : ");
    for(int i=0;i<size;i++)
    {
    arr[i]=in.nextInt();
    }

    System.out.println("enter position you want to delete element : ");
    int x=in.nextInt();


    for(int i=0;i<arr.length;i++)
    {
    if(i<x-1)
    {
        arr2[i]=arr[i];
    }
    else if(i==x-1)
    {
        continue;
    }
    else
    {
        arr2[i-1]=arr[i];
    }
    }

    System.out.println("Your updated array are : ");

    for(int i=0;i<size-1;i++)
    {
         System.out.println(arr2[i]);
    }
}    
}
