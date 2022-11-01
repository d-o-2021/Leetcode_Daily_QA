class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if((m*n)<original.length||(m*n)>original.length)return new int[0][];
        int ans[][]=new int[m][n];
        int row=0;
        for(int i=0;i<original.length;)
        {
            int count=0;
            while(row<m&&count<n)
            {
                ans[row][count]=original[i++];
                count++;
            }
            row++;
        }
        return ans;
    }
}
