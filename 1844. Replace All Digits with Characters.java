class Solution {
    public String replaceDigits(String s) {
        String ans="";
        int i;
        for(i=0;i<s.length()-1;i+=2)
        {
            ans+=s.charAt(i)+""+(char)(s.charAt(i)+(s.charAt(i+1)-'0'));
        }
        if(i==s.length()-1)ans+=s.charAt(s.length()-1);
        return ans;
    }
}
