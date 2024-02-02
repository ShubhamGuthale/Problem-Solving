//Given a number N, calculate the prime numbers up to N. 
//Input: N = 10 ; Output: 2 3 5 7

import java.util.*;
class CalPrimeNum
{
public static void main(String args[]) 
{
    int i,j,count;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter N value : ");
    int n=in.nextInt();
    System.out.print("Prime numbers between 1 to " +n+" :" );
    for(j=2;j<=n;j++)
    {
       count = 0;
       for(i=1;i<=j;i++)
       {
          if(j%i==0){
             count++;
          }
       }
       if(count==2)
       System.out.print("  " +j );
       }   
    
 }
}
