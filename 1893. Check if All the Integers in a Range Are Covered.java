class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++)
        {
            boolean flag=false;
            for(int j[]:ranges)
            {
                int st=j[0];
                int ed=j[1];
                if((i>=st&&i<=ed))
                {
                    flag=true;
                    break;
                }
                else continue;
            }
            if(!flag)return false;
        }
        return true;
    }
}
