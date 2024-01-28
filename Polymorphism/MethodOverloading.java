//Method Overloading

import java.util.Scanner;

public class dsa15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int aa=sc.nextInt();
        int ab=sc.nextInt();
    
       int ans = sum(aa,ab);
       System.out.println("sum is are : " + ans);
    }
    
    static int sum(int a,int b)
    {
        return a+b;
    }

    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}
