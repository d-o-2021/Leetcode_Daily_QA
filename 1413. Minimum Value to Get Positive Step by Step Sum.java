class Solution {
    public int minStartValue(int[] nums) {
        // int  min=Integer.MAX_VALUE;
        // for(int i:nums)
        // {
        //     if(min>i)
        //     {
        //         min=i;
        //     }
        // }
        int startvalue=1;
        // if(min<=0)
        // {
        //     startvalue=Math.abs(min)+1;
        // }
        // else
        // {
        //     startvalue=min;
        // }
        int temp=startvalue;
        for(int i=0;i<nums.length;i++)
        {
            if(startvalue+nums[i]>=1)
            {
                startvalue+=nums[i];
            }
            else
            {
                i=-1;
                temp++;
                startvalue=temp;
            }
        }
        return temp;
    }
}
