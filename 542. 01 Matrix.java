class node
{
    int row;
    int col;
    int dist;
    node(int row,int col,int dist)
    {
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int [][]visited=new int[mat.length][mat[0].length];
        int [][]distance=new int[mat.length][mat[0].length];
        Queue<node> q=new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new node(i,j,0));
                    visited[i][j]=1;
                }
                else
                {
                    visited[i][j]=0;
                }
            }
        }
        int delR[]={-1,0,+1,0};
        int delC[]={0,+1,0,-1};

        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int dist=q.peek().dist;

            q.remove();
            distance[row][col]=dist;
            for(int i=0;i<4;i++)
            {
                int nrow=row+delR[i];
                int ncol=col+delC[i];
                if(nrow>=0 && nrow<mat.length && ncol>=0 && ncol<mat[0].length && visited[nrow][ncol]==0)
                {
                    visited[nrow][ncol]=1;
                    q.add(new node(nrow,ncol,dist+1));
                }
            }

        }
    
        return distance;
    }
}
