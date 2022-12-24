class Solution {
    public int unequalTriplets(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    if(nums[i]!=nums[j])
                    {
                        if(nums[i]!=nums[k])
                        {
                            if(nums[j]!=nums[k])count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
