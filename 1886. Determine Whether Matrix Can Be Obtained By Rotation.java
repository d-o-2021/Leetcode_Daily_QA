class Solution {
    public boolean isEqual(int mat[][],int target[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
    public void rotate(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i+1;j<mat[0].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length/2;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][mat.length-j-1];
                mat[i][mat.length-j-1]=temp;
            }
        }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        if(isEqual(mat,target))return true;
        for(int i=0;i<3;i++)
        {
            rotate(mat);
            if(isEqual(mat,target))
            {
                return true;
            }
        }
        return false;
    }
}
