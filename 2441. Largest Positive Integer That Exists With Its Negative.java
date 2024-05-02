//method I
class Solution {
    public int findMaxK(int[] nums) {
        // -7 -1 1 6 7 10
        // -10 -3 -2 6 7 8
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            int temp=nums[i];
            int st=0;
            while(st<nums.length&&(temp<=((-1)*nums[st]))&&nums[st]<0)
            {
                if(temp==(-1)*(nums[st]))
                {
                    return temp;
                }
                else{
                    st++;
                }
            }
        } 
        return -1;
    }
}


//method II
class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && nums[i]<0){
            map.put((nums[i]*(-1)),1);
            i++;
        }
        i=nums.length-1;
        while(i!=0){
            if(nums[i]>0){
                if(map.containsKey(nums[i]))return nums[i];
            }
            i--;
        }
        return -1;
    }
}
