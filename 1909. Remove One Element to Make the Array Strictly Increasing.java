/*
        //case 1 : countpeak==1 (p+1)>(p-1) remove p
        //         !(p).        .
        //               .(p+1)
        //     (p-1).          
        // .
        //case 2 : countpeak==1 (p+2)>(p) remove p+1
        //                  (p+2).
        //         (p).       
        //             !(p+1).
        //     .          
        // .
        // case 3 : countpeak==0
        //                  .
        //              .
        // !(p).     .
        //      .
        // case 4 : countpeak==0
        //               (p).
        //          .         !.
        //      .
        // .
        // note !: removing that element
*/
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int p=0;
        int countpeak=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                countpeak++;
                p=i;
            }
        }
        if(countpeak>1)return false;
        else if(countpeak==1)
        {
            if(p==0||p==nums.length-2)return true;
            else if(nums[p+1]>nums[p-1]||nums[p+2]>nums[p])return true;
            else return false;
        }
        return true;
    }
}
