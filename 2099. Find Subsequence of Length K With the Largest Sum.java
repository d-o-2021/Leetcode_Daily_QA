class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        List<Integer> arr=new ArrayList<>();
        //for max heap
        // PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->(b-a));
        //or
        // PriorityQueue<Integer> q=new PriorityQueue<>(new Comparator<Integer>(){
        //     public int compare(Integer a1,Integer a2){return a2-a1;}});
        for(int i:nums)
        {
            q.add(i);
            arr.add(i);
        }
        for(int i=0;i<nums.length-k;i++)
        {
            arr.remove(q.poll());
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
