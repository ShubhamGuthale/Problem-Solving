//prime number or not

import java.util.Scanner;
class PrimeOrNot
{  
    public static void main(String[] args)
    {
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=in.nextInt();
        if(n==1)
        {
            System.out.println("not prime");
        }
        else
        {
        for(int i=2;i<n;i++) 
        {
            if (n%i==0)
            {
                count++;
            }
            
        }
    if (count==0) 
        {
        System.out.println("prime");
        }
    else
    {
        System.out.println("not prime");
    }
    }
    }
}
