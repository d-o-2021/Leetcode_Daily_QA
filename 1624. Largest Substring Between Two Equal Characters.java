class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            int st=s.indexOf(s.charAt(i));
            int ed=s.lastIndexOf(s.charAt(i));
            if(st!=ed)
            {
                if(max<(ed-st))max=(ed-st)-1;
            }
        }
        return max;
    }
}
