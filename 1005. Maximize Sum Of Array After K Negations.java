class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:nums)
        {
            q.add(i);
        }
        while(k>0)
        {
            q.add((-1)*q.remove());
            k--;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=q.remove();
        }
        return sum;
        // Arrays.sort(nums);
        // int sum=0;
        // int countneg=0;
        // for(int i:nums)
        // {
        //     if(i<0)countneg++;
        //     else break;
        // }
        // if(countneg!=0)
        // {
        //     if(countneg>=k)
        //     {
        //         for(int i:nums)
        //         {
        //             if(k>0&&i<0){sum+=(-1)*i;k--;}
        //             else sum+=i;
        //         }
        //         return sum;
        //     }
        //     else if(countneg<k)
        //     {
                
        //     }
        // }
        
    }
}
