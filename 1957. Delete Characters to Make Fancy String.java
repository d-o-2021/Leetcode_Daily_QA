class Solution {
    public String makeFancyString(String s) {
        // String ans="";
        StringBuffer ans=new StringBuffer();
        char prev=' ';
        int count=1;
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(curr==prev)
            {
                count++;
            }
            else
            {
                count=1;
                prev=curr;
            }
            if(count<3)
            {
                ans.append(curr);
            }
        }
        return ans.toString();
    }
}
