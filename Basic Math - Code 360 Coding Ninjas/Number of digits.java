//Number of digits - Code 360 coding ninjas
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int cnt=0;
        while(n>0)
        {
        int Ldigit=n%10;
        cnt=cnt+1;
        n=n/10;
        }
        return cnt;
    }
}
//Tc ---> O(log10(n))
