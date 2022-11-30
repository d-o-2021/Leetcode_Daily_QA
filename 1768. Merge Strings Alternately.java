class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i,j;
        for(i=0,j=0;i<word1.length()&&j<word2.length();)
        {
            ans+=word1.charAt(i++);
            ans+=word2.charAt(j++);
        }
        while(j<word2.length())
        {
            ans+=word2.charAt(j++);
        }
        while(i<word1.length())
        {
            ans+=word1.charAt(i++);
        }
        return ans;
    }
}
