class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int sum=0;
        List<Boolean> ans=new ArrayList<>();
        for(int i : nums)
        {
            sum=((sum*2)+i)%5;
            // System.out.println(sum);
            if(sum==0)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}
