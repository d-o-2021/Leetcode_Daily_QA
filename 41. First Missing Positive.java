class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest=1;
        for(int i:nums){
            if(i<=0)continue;
            if(i==smallest-1)continue;
            else{
                if(i!=smallest){
                    return smallest;
                }
                else smallest++;
            }
        }
        return smallest;
    }
}
