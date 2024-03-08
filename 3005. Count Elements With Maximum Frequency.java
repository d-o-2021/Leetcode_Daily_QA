class Solution {
    public int maxFrequencyElements(int[] nums) {
        int num[]=new int[101];
        for(int i:nums){
            num[i]++;
        }
        Arrays.sort(num);
        int freq=num[100];
        int ans=0;
        for(int i=100;i>0;i--){
            if(num[i]==0)break;
            if(freq==num[i]){
                ans+=num[i];
            }
        }
        return ans;
    }
}
