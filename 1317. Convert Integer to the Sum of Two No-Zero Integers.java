class Solution {
    public boolean checkzero(int i)
    {
        while(i!=0)
        {
            if(i%10==0)return false;
            i/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n/2;i++)
        {
            if(checkzero(i)&&checkzero(n-i))return new int[]{i,n-i};
        }
        return new int[]{};
    }
}
