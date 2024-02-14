class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=0;
        while(i<nums.length && nums[i]<0){
            i++;
        }
        while(j<nums.length && nums[j]>0){
            j++;
        }
        int ans[]=new int[nums.length];
        int index=0;
        while(i<nums.length){
            if(nums[i]>0){
                ans[index]=nums[i];
                index+=2;
            }
            i++;
        }
        index=1;
        while(j<nums.length){
            if(nums[j]<0){
                ans[index]=nums[j];
                index+=2;
            }
            j++;
        }
        return ans;
    }
}
