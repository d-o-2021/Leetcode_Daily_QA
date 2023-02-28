class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index=0;
        int i=0;
        int dist=Integer.MAX_VALUE;
        for(int arr[]:points)
        {
            if(arr[0]==x||arr[1]==y)
            {
                int temp=Math.abs(arr[0]-x)+Math.abs(arr[1]-y);
                if(dist>temp)
                {
                    dist=temp;
                    index=i;
                    if(dist==temp)
                    {
                        if(index>i)index=i;
                    }
                }
            }
            i++;
        }
        if(dist==Integer.MAX_VALUE)return -1;
        return index;
    }
}
