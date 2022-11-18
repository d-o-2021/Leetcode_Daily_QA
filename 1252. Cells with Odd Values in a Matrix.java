class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int twod[][]=new int[m][n];
        for(int arr[]:indices)
        {   
            int ri=arr[0];//0
            int ci=arr[1];//1
            for(int i=0;i<n;i++)
            {
                twod[ri][i]+=1;//[0][0-2]
            }
            for(int i=0;i<m;i++)
            {
                twod[i][ci]++;//[0-1][1]
            }
        }
        int count=0;
        for(int arr[]:twod)
        {
            for(int i:arr)
            {
                if(i%2!=0)count++;
            }
        }
        return count;
    }
}
