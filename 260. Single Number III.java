class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int index=0;
        int i;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;){
            if((nums[i]^nums[i+1])!=0){
                arr[index++]=nums[i];
                i++;
            }else{
                i+=2;
            }
        }
        if(i==nums.length-1){
            arr[index]=nums[i];
        }
        return arr;
    }
}
