class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences)
        {
            int temp=0;
            for(String ss:s.split(" "))
            {
                temp++;
            }
            if(max<temp)max=temp;
        }
        return max;
    }
}
