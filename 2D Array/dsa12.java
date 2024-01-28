//program for 2D array accept input and display it.

import java.util.Scanner;

public class dsa12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of rows : ");
        int rows=in.nextInt();
        System.out.println("enter size of column : ");
        int colm=in.nextInt();

        int arr[][]=new int[rows][colm];
        
        //accept input
        System.out.println("enter 2D array: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colm;j++)
            {
                
                arr[i][j]=in.nextInt();
            }
            
        }

        //print outputs
        System.out.println("your 2D array is : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colm;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
