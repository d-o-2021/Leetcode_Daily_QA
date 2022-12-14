class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1)return -1;//visited cell must be zero source & destination
        Queue<int []> que=new LinkedList<>();//for bfs int array inclued {x,y,curr diatance}
        boolean visited[][]=new boolean[n][n];
        que.add(new int[]{0,0,1});
        visited[0][0]=true;
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};//all possible 8 directions
        while(!que.isEmpty())//bfs level order
        {
            int curr[]=que.remove();
            int px=curr[0];
            int py=curr[1];
            int dist=curr[2];
            if(px==n-1&&py==n-1)//if we reached our destination than return distance
            {
                return dist;
            }
            for(int d[]:dir)//calcluate with all possible directions
            {
                int cx=px+d[0];
                int cy=py+d[1];
                if(cx<0||cy<0||cx>=n||cy>=n||visited[cx][cy]||grid[cx][cy]==1)//cx , cy must inbound of matrix
                //and if visited and if path includes 1 than simply continue
                {
                    continue;
                }
                else
                {
                    que.add(new int[]{cx,cy,dist+1});//if not visited just add distance                    
                    visited[cx][cy]=true;
                }
            }
        }
    return -1;       
    }
}
