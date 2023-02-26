class Solution {
    public int convertTime(String current, String correct) {
        int curr=(Integer.parseInt(current.substring(0,2))*60)+(Integer.parseInt(current.substring(3)));
        int corr=(Integer.parseInt(correct.substring(0,2))*60)+(Integer.parseInt(correct.substring(3)));
        int count=0;
        while(curr<=corr&&curr!=corr)
        {
            if(curr+60<=corr)
            {
                count++;
                curr+=60;
            }
            else if(curr+15<=corr)
            {
                count++;
                curr+=15;
            }
            else if(curr+5<=corr)
            {
                count++;
                curr+=5;
            }
            else if(curr+1<=corr)
            {
                count++;
                curr+=1;
            }
        }
        return count;
    }
}
