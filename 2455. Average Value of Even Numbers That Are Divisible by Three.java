class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int i:nums)
        {
            if(i%3==0)
            {
                if(i%2==0){
                    count++;
                    sum+=i;
                }
            }
        }
        if(count==0)return 0;
        else
        return sum/count;
    }
}
