class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length-1;i++)
        {
            for(int j=0;j<colors.length;j++)
            {
                if(colors[i]!=colors[j])
                {
                    if(max<(j-i))max=j-i;
                }
            }
        }
        return max;
    }
}
