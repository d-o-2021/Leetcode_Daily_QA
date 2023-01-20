class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pair=0;
        int rem=0;
        // 1 1 2 2 2 3 3
        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            while(i<nums.length-1&&nums[i]==nums[i+1])
            {
                count++;
                i++;
            }
            pair+=count/2;
            rem+=count%2;
        }
        return new int[]{pair,rem};
    }
}
