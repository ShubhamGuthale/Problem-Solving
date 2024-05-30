class Solution {
    public boolean isPalindrome(int x) {
        int n= x;
        int rem=0;
        int ans=0;
        while(x>0)
        {
            rem=x%10;
            x=x/10;
            if(ans>Integer.MAX_VALUE/10)
            return false;
            ans=ans*10+rem;
        }
        if(n==ans)
        return true;

        else
        return false;
        
    }
}
