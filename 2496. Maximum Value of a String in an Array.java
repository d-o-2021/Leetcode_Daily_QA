class Solution {
    public int len(String s)
    {
        int i=0;
        try
        {
            i=Integer.parseInt(s);
        }
        catch(Exception e)
        {
            return s.length();
        }
        return i;
    }
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s :strs)
        {
            if(max<len(s))
            {
                max=len(s);
            }
        }
        return max;
    }
}
