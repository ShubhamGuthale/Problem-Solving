//program for insert value in array in particular position

import java.util.Scanner;

class prg16
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=in.nextInt();
        int a[]=new int[n];//first array
        int b[]=new int[n+1];//second array
        System.out.println("Enter values or Array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();//a[0],a[1]...

        }
        System.out.println("Enter new values to be inserted :");
        int p=in.nextInt();
        System.out.println("Enter index of new value :");
        int m=in.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i<m)
            {
            b[i]=a[i];
            }
            else if(i==m)
            {
                b[i]=p;
            }
            else
            {
                b[i]=a[i-1];
            }

        }
        System.out.println("Your updated Array are:");
        for(int i=0;i<n+1;i++)
        {
            System.out.println(b[i]);
        }

    }
}
