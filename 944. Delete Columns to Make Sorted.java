class Solution {
    public int minDeletionSize(String[] strs) {
        int len=strs[0].length();
        int ans=0;
        boolean check[]=new boolean[len];
        if(strs.length==1)return 0;
        for(int i=1;i<strs.length;i++)
        {
            for(int j=0;j<len;j++)
            {
                if((strs[i-1].charAt(j)>strs[i].charAt(j))&&!check[j])
                {
                    ans++;
                    check[j]=true;
                }
            }
        }
        return ans;
    }
}
