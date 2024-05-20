class Solution {
    public int findPeakElement(int[] nums) {
        // int n=nums[0];
        int ans=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[0]<nums[i])
            {
                nums[0]=nums[i];
                ans=i;
            }

        }
        return ans;
    }
}