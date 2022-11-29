class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        for(int index=0;index<code.length;index++)
        {
            int temp=k;
            while(temp!=0)
            {
                if(temp<0)
                ans[index]+=code[(index+(code.length+temp))%code.length];
                else
                ans[index]+=code[(index+temp)%code.length];
                if(temp<0)temp++;
                else temp--;
            }
        }
        return ans;
    }
}
