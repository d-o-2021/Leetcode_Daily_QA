class Solution {
    public int differenceOfSum(int[] nums) {
        int ans=0;
        int esum=0;
        int dsum=0;
        for(int i:nums)
        {
            esum+=i;
            while(i!=0)
            {
                dsum+=i%10;
                i/=10;
            }
        }
        return Math.abs(esum-dsum);
    }
}
