class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int count=0;
        for(int i=happiness.length-1;i>=0;i--){
            if(k>0){
                if(happiness[i]>0){
                    int value = happiness[i]-count;
                    if(value>0){
                        ans+=(value);
                        count++;
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
