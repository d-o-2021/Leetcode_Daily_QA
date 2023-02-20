class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))return -1;
        for(int i=a.length()-1;i>=0;i--)
        {
            if(b.indexOf(a)==-1)
            {
                if(a.length()>=b.length())return a.length();
                else return b.length();
            }
            else
            {
                return Math.max(a.length(),b.length());
            }
        }
        return -1;
    }
}
