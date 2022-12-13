class Solution {
    public int gcd(int n1,int n2)
    {
        if(n2==0)return n1;
        if(n1==0)return n2;  
        return gcd(n2,n1%n2); 
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        return gcd(min,max);
    }
}
