class Solution {
    public int bitwiseComplement(int n) {
        int ans=0;
        int rem=0;
        int mul=1;
        if(n==0)
        return 1;
        while(n>0)
        {
           rem=n%2;
           rem=rem^1;
           n=n/2;
           ans=ans+rem*mul;
           mul=mul*2; 
        }
       return ans;
    }
}
