class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)return 1;
        if(trust.length==0 && n>1)return -1;
        Set<Integer> set= new HashSet<>();
        for(int i[]:trust){
            set.add(i[1]);
        }
        boolean flag=true;
        int count=0;
        int ans=0;
        for(int i:set){
            flag=true;
            for(int j[]:trust){
                if(i == j[0]){
                    flag=false;
                }
            }
            if(flag){count++;ans=i;}
        }
        int count2=0;
        if(count==1)
        {
            for(int i[]:trust){
                if(i[1]==ans)count2++;
            }
        }
        if(count2==n-1)
        return ans;
        else return -1; 
    }
}
