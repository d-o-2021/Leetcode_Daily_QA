class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int c=1;
        while(n>0)
        {
            count++;
            c++;
            n-=c;
        }
        return count;
    }
}
