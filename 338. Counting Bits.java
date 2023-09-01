class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int index=0;
        for(int i=0;i<=n;i++)
        {
            if(i==0){ans[index++]=0;continue;}
            else if(i==1){ans[index++]=1;continue;}
            else if(i==2){ans[index++]=1;continue;}
            int temp=i;int count=0;
            while(temp!=0)
            {
                if(temp%2==1)count++;
                temp/=2;
            }
            ans[index++]=count;
        }
        return ans;
    }
}
