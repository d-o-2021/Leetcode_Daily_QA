class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        int st=word.indexOf(ch);
        for(int i=st;i>=0;i--)
        {
            ans+=word.charAt(i);
        }
        for(int i=st+1;i<word.length();i++)ans+=word.charAt(i);
        return ans;
    }
}
