class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int count0=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)count0++;
            else if(nums[i]>0)
            {
                int temp=nums[i];
                nums[i]=0;
                nums[i-count0]=temp;
            }
        }
        return nums;
        
    }
}
