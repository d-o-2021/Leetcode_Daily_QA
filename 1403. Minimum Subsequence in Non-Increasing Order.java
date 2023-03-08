class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        // 3 4 8 9 10
        // 4 4 6 7 7
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int ed=nums.length-1;
        int st=0;
        for(int i=ed;i>=0;i--)
        {
            int sumleft=0;
            int sumright=0;
            for(int j=i;j<nums.length;j++)
            {
                sumright+=nums[j];
            }
            for(int j=i-1;j>=0;j--)
            {
                sumleft+=nums[j];
            }
            if(sumright>sumleft)
            {
                for(int j=i;j<nums.length;j++)
                {
                    ans.add(nums[j]);
                }
                    break;
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        return ans;
    }
}
