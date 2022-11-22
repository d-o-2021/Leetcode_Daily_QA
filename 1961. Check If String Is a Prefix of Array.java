class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String st="";
        for(int i=0;i<words.length;i++)
        {
            st+=words[i];
            if(s.indexOf(st)==0)
            {
                if(st.length()==s.length())return true;//if string st become equals to s than no need to check for fiuther prefixes 
                continue;
            }
            else
            {
                return false;
            }
        }
        if(st.length()==s.length())return true;//s must be generated using words i.e length also must be same consider this example : words : ["c","cc"]   s: "ccccccccc" since we can'nt create string s using all words of words array therefore we need to include this check also!
        return false;
    }
}
