class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans[]=new int[queries.length];
        Arrays.sort(nums);
        int index=0;
        for(int i:queries)
        {
            int sum=0;
            int k=0;
            while(k<nums.length)
            {
                sum+=nums[k++];
                if(sum<=i)
                {
                    ans[index]=k;
                }
            }
            index++;
        }
        return ans;
    }
}
