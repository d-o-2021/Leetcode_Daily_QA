class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(Math.abs(i)<=Math.abs(min))min=i;
        }
        return min;
    }
}
