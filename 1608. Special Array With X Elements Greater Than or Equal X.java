class Solution {
    public int specialArray(int[] nums) {
        int i=nums.length;
        while(i!=0)
        {
            int count=0;
            for(int j:nums)
            {
                if(j>=i)count++;
            }
            if(count==i)return i;
            else i--;
        }
        return -1;
    }
}
