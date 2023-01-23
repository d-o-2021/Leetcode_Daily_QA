class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id=logs[0][0];
        int max=logs[0][1];
        for(int i=0;i<logs.length;i++)
        {
            int diff=0;
            if(i>0)
            diff=logs[i][1]-logs[i-1][1];
            if(max==diff)
            {
                if(id>logs[i][0])id=logs[i][0];
            }
            else if(max<diff)
            {
                max=diff;
                id=logs[i][0];
            }
        }  
        return id;
    }
}
