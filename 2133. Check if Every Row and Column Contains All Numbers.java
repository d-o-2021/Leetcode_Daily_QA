class Solution {
    public boolean isValid(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)return false;
        }
        return true;
    } 
    public boolean checkValid(int[][] matrix) {
        for(int i[]:matrix)
        {
            int arr[]=new int[matrix.length];
            for(int j:i)
            {
                arr[j-1]++;
            }
            if(!isValid(arr))
            {
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            int arr[]=new int[matrix.length];
            for(int j=0;j<matrix.length;j++)
            {
                arr[matrix[j][i]-1]++;
            }
            if(!isValid(arr))
            {
                return false;
            }
        }
        return true;
    }
}
