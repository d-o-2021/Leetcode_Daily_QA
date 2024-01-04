class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==1)return -1;
            if(e.getValue()%3==0)
            {
                ans+=(e.getValue()/3);
            }
            else if(e.getValue()%3==1){
                int temp=e.getValue();
                temp-=2;
                ans+=1;
                if(temp<3)ans+=1;
                else{
                    ans+=temp/3;
                    ans+=1;
                }
            }
            else{
                ans+=e.getValue()/3;
                ans+=1;
            }
        }
        return ans==0?-1:ans;
    }
}
