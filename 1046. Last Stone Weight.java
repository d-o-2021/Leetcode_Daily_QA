class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        // 1 3 
        int curr=stones.length-1;
        int prev=curr-1;
        while((curr>0))
        {
            if(stones[curr]==stones[prev])
            {
                stones[curr]=stones[prev]=Integer.MAX_VALUE;
                curr-=2;
                prev-=2;
            }
            else
            {
                stones[prev]=stones[curr]-stones[prev];
                curr-=1;
                prev-=1;
            }
                Arrays.sort(stones);
        }
        if(curr<0)
        return 0;
        return stones[curr];
        
    }
}
