class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set=new HashSet<>();
        int i=0;int j=nums.length-1;
        while(i<j)
        {
            double sum=(double)(nums[i]+nums[j])/2;
            set.add(sum);
            i++;j--;
        }
        return set.size(); 
        // 0 2 5 7 7 7 8 8 9 9       
    }
}
