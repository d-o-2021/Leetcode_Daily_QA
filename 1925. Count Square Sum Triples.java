class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int k=(int)Math.sqrt((i*i)+(j*j));
                if((k*k)==((i*i)+(j*j))&&k<=n)
                {
                    count+=2;
                }
            }
        }
        return count;
    }
}
