class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)return nums;
        Deque<Integer> window=new LinkedList<>();
        int ans[]=new int[nums.length-k+1];
        int ansi=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!window.isEmpty() && window.peek()==(i-k))
            {
                window.poll();
            }
            while(!window.isEmpty() && nums[window.peekLast()]<=nums[i]){
                window.pollLast();
            }
            window.offer(i);
            if(i>=k-1)
            {
                ans[ansi++]=nums[window.peek()];
            }

        }
        return ans;
    }
}
