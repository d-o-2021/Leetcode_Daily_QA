class Solution {
    public int findMaxK(int[] nums) {
        // -7 -1 1 6 7 10
        // -10 -3 -2 6 7 8
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            int temp=nums[i];
            int st=0;
            while(st<nums.length&&(temp<=((-1)*nums[st]))&&nums[st]<0)
            {
                if(temp==(-1)*(nums[st]))
                {
                    return temp;
                }
                else{
                    st++;
                }
            }
        } 
        return -1;
    }
}
