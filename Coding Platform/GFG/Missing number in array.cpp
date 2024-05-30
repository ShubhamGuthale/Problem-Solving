class Solution{
  public:
    int missingNumber(vector<int>& array, int n) {
        // Your code goes here
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+array[i];
            
        int ans=n*(n+1)/2;

        return ans-sum;
    }
};
