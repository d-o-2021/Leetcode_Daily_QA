class Solution {
    public boolean isThree(int n) {
        if(n<4)return false;
        if(n==4)return true;
        int i;
        for(i=2;i*i<n;i++)
        {
            if(n%i==0)return false;
        }
        if(i*i==n)return true;
        return false;
    }
}
