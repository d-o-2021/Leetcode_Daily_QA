class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key)
            {
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
            }
        }
        int  max=0;
        int ans=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            if(e.getValue()>max)
            {
                ans=e.getKey();
                max=e.getValue();
            }
        }
        return ans;
    }
}
