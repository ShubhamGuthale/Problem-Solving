class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int ans=-1;
        //longest element
        for(int i=0;i<n;i++)
        {
            if(arr[i]>ans)
            ans=arr[i];
        }
        //second largest
        int second=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=ans)
            {
            second=max(second,arr[i]);
            }
        }
        return second;
    }
}
