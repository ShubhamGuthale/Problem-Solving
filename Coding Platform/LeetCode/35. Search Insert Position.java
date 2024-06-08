class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int ans=nums.length;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                break;
            }
            else if(nums[mid]<target)
            start=mid+1;
            else
            {
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}
