class Solution {
    public String makeGood(String s) {
        // 65 97 leEeetcode
        for(int i=0;i<s.length()-1;i++)
        {
            if(Math.abs((s.charAt(i)-'a')-(s.charAt(i+1)-'a'))==32)//this condtn shows that both character were same and opposite in case
            {
                String temp=s;
                temp=s.substring(0,i);
                if(i<s.length()-2)
                temp+=s.substring(i+2,s.length());
                s=temp;
                i=-1;//again process the string from start
            }
        }
        return s;
    }
}
