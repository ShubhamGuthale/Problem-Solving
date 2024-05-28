// Check Prime - Code 360 Coding Ninjas
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        //Your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                cnt=cnt+1;
            }
        }
            if(cnt==2)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
    }

}

//problem link -  https://www.naukri.com/code360/problems/check-prime_624674
