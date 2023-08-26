class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,new Comparator<int[]>()
        {
            public int compare(int a[],int b[]){return a[1]-b[1];}
        });
        int curr=0;
        int ans=1;
        for(int i=1;i<pairs.length;i++)
        {
            if(pairs[curr][1]<pairs[i][0])
            {
                curr=i;
                ans++;
            }
        }
        return ans;
    }
}
