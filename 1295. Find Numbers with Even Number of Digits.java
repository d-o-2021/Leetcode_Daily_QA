class Solution {
    public boolean even(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return (count%2)==0;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)
        {
            if(even(i))count++;
        }
        return count;
    }
}
