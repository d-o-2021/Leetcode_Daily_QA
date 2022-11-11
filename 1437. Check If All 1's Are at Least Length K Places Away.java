class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                i++;
                int count=0;
                while(i<nums.length&&nums[i]!=1)
                {
                    i++;count++;
                }
                if(i<nums.length&&count<k)//i<num.length condtn ensure that i remains within range and if there exists 1 at last place it will give wrong results
                {
                    return  false;
                }
                i--;
            }
        }
        return true;
    }
}
