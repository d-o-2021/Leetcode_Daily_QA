class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int currp=0;
        int ans=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            currp=prices[i]-min;
            if(currp>ans)
            {
                ans=currp;
            }
        }
        return ans;
        
        //tle
        // List<Integer> set=new ArrayList<>();
        // for(int i=0;i<prices.length-1;i++)
        // {
        //     for(int j=i+1;j<prices.length;j++)
        //     {
        //         if(prices[j]>prices[i])
        //         {
        //             set.add(prices[j]-prices[i]);
        //         }
        //     }
        // }
        // Collections.sort(set);
        // if(set.size()==0)return 0;
        // else 
        // return set.get(set.size()-1);
    }
}
