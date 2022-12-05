class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sumleft=0;
            int sumright=0;
            for(int j=i-1;j>=0;j--)
            {
                sumleft+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++)
            {
                sumright+=nums[k];
            }
            if(sumleft==sumright)return i;
        }
        return -1;
    }
}
