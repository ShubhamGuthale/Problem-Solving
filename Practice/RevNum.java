//reverse number

import java.util.Scanner;

class RevNum
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter number you want to reverse :");
         int num=s.nextInt();
        //int num=1234567;
        int ans=0;
        while(num>0)
        {
            int rem=num % 10;
            num /= 10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
