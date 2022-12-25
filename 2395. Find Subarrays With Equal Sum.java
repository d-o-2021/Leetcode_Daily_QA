class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=nums[0]+nums[1];
        map.put(sum,1);
        for(int i=1;i<nums.length-1;i++)
        {
            map.put((nums[i]+nums[i+1]),map.getOrDefault((nums[i]+nums[i+1]),0)+1);
            if(map.get((nums[i]+nums[i+1]))>=2)return true;
        }
        return false;
    }
}
