class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;
        int sum=0;
        while(i<mat.length)
        {
            sum+=mat[i][i];
            i++;
        }
        int j=i-1;
        i=0;
        while(i<mat.length)
        {
            sum+=mat[i][j];
            i++;
            j--;
        }
        if(!(mat.length%2==0))
        {
            sum-=mat[(mat.length/2)][(mat.length/2)];
        }
        return sum;
    }
}
