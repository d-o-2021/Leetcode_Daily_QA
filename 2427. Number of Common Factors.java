class Solution {
    public int commonFactors(int a, int b) {
        int max=Math.max(a,b);
        int count=0;
        for(int i=1;i<=max/2;i++)
        {
            if(a%i==0&&b%i==0)count++;
        }
        if(a==b)return count+1;
        return count;
    }
}
