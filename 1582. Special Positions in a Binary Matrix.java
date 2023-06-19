class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    boolean flag1=true;
                    boolean flag2=true;
                    for(int k=0;k<mat[i].length;k++)
                    {
                        if(j!=k)
                        {
                        if(mat[i][k]==1)
                        {
                            flag1=false;
                            break;
                        }
                        }
                    }
                    for(int k=0;k<mat.length;k++)
                    {
                        if(i!=k)
                        {
                        if(mat[k][j]==1)
                        {
                            flag2=false;
                            break;
                        }
                        }
                    }
                    if(flag1&&flag2)count++;
                }
            }
        }
        return count;
    }
}
